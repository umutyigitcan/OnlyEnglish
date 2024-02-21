package com.example.onlineenglish

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.onlineenglish.databinding.FragmentGirisSayfasiBinding
import com.example.onlyenglish.KullaniciKayit
import com.google.android.gms.common.api.internal.TaskApiCall
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.core.Context

// ... (Diğer import ifadeleri)

class GirisSayfasi : Fragment() {
    private lateinit var tasarim: FragmentGirisSayfasiBinding
    private lateinit var handler: Handler
    private lateinit var runnable: Runnable
    var sayi = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentGirisSayfasiBinding.inflate(inflater, container, false)
        handler = Handler(Looper.getMainLooper())
        runnable = object : Runnable {
            override fun run() {
                sayi++
                handler.postDelayed(this, 1000)
            }
        }

        var database = FirebaseDatabase.getInstance()
        var refKisiler = database.getReference("Kullanicilar")

        tasarim.giris.setOnClickListener {
            handler.post(runnable)

            var g1 = tasarim.giriskullanici.text.toString().trim()
            var g2 = tasarim.girissifre.text.toString().trim()

            if (g1 == "" || g2 == "") {
                Toast.makeText(requireContext(), "Lütfen kullanıcı adı ve şifre giriniz!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            refKisiler.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onCancelled(error: DatabaseError) {
                    // Hata durumunda burada işlemler yapabilirsiniz.
                }

                override fun onDataChange(ds: DataSnapshot) {
                    var kullaniciBulundu = false

                    for (p in ds.children) {
                        var kisi = p.getValue(KullaniciKayit::class.java)
                        if (kisi != null) {
                            var key = p.key
                            if (g1 == kisi.kullanici_adi.toString() && g2 == kisi.sifre.toString()) {
                                kullaniciBulundu = true
                                break
                            }
                        }
                    }

                    if (kullaniciBulundu) {
                        Navigation.findNavController(it).navigate(R.id.action_girisSayfasi_to_anamenu)
                    } else {
                        Toast.makeText(requireContext(), "Kullanıcı adı veya şifre hatalı!", Toast.LENGTH_SHORT).show()
                    }
                }
            })

            if (sayi > 2) {
                tasarim.uyari.visibility = View.VISIBLE
            }
        }

        tasarim.kayit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_girisSayfasi_to_kayitSayfasi)
        }

        return tasarim.root
    }
}
