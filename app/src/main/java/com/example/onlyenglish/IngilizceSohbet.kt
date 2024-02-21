package com.example.onlyenglish

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.onlineenglish.databinding.FragmentIngilizceSohbetBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class IngilizceSohbet : Fragment() {

    private lateinit var tasarim: FragmentIngilizceSohbetBinding
    private lateinit var mesajlar: ArrayList<Mesajdata>
    private lateinit var adapter: RVAdaptermesaj
    private var gonderilecekmesaj = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentIngilizceSohbetBinding.inflate(inflater, container, false)



        val database = FirebaseDatabase.getInstance()
        val kisimesaj = database.getReference("diyalog")

        tasarim.rv.setHasFixedSize(true)
        val layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.reverseLayout = false
        tasarim.rv.layoutManager = layoutManager

        mesajlar = ArrayList()

        adapter = RVAdaptermesaj(requireContext(), mesajlar)
        tasarim.rv.adapter = adapter

        kisimesaj.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {

            }

            override fun onDataChange(ds: DataSnapshot) {
                mesajlar.clear()

                for (p in ds.children) {
                    // getValue fonksiyonunu sadece çağırarak dinamik tip dönüşümü yapmasına izin verelim
                    val getirilen = p.getValue()

                    // Eğer veri bir String ise, Mesajdata oluşturup listeye ekleyelim
                    if (getirilen is String) {
                        mesajlar.add(Mesajdata(getirilen))
                    }
                    // Eğer veri bir HashMap ise, HashMap'ten içeriği alarak Mesajdata oluşturup listeye ekleyelim
                    else if (getirilen is HashMap<*, *>) {
                        val icerik = getirilen["icerik"] as? String
                        if (icerik != null) {
                            mesajlar.add(Mesajdata(icerik))
                        }
                    }
                }

                adapter.notifyDataSetChanged()

                tasarim.rv.scrollToPosition(adapter.itemCount - 1)
            }


        })

        tasarim.gonder.setOnClickListener {
            gonderilecekmesaj = tasarim.sohbetyazi.text.toString()
            kisimesaj.push().setValue(gonderilecekmesaj)
            tasarim.sohbetyazi.text = Editable.Factory.getInstance().newEditable("")
        }

        return tasarim.root
    }
}
