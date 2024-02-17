package com.example.onlyenglish

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        layoutManager.reverseLayout = false // En üstten başla
        tasarim.rv.layoutManager = layoutManager

        mesajlar = ArrayList()

        adapter = RVAdaptermesaj(requireContext(), mesajlar)
        tasarim.rv.adapter = adapter

        kisimesaj.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {
                // İşlem iptal edildiğinde yapılacak işlemler
            }

            override fun onDataChange(ds: DataSnapshot) {
                mesajlar.clear() // Her onDataChange çağrısında mevcut listeyi temizle

                for (p in ds.children) {
                    val getirilen = p.getValue(String::class.java)
                    if (getirilen != null) {
                        mesajlar.add(Mesajdata(getirilen))
                    }
                }

                // Veri değişikliği durumunda adapter'ı güncelle
                adapter.notifyDataSetChanged()

                // RecyclerView'ı en alttan başlat
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
