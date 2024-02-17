package com.example.onlineenglish

import android.opengl.Visibility
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.onlineenglish.databinding.FragmentKayitSayfasiBinding
import com.example.onlyenglish.KullaniciKayit
import com.google.firebase.database.FirebaseDatabase

class KayitSayfasi : Fragment() {

    private lateinit var tasarim:FragmentKayitSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentKayitSayfasiBinding.inflate(inflater,container,false)

        var database=FirebaseDatabase.getInstance()
        var refKisiler=database.getReference("Kullanicilar")


        tasarim.kayitol.setOnClickListener {
            if(tasarim.kayitkullanici.text.toString().length<8||tasarim.kayitsifre.text.toString().length<8){
                tasarim.uyari.visibility = View.VISIBLE
            }else{
                var g1=tasarim.kayitkullanici.text.toString().trim()
                var g2=tasarim.kayitsifre.text.toString().trim()

                var kayit=KullaniciKayit("null",g1,g2)
                refKisiler.push().setValue(kayit)
                tasarim.kayitkullanici.text=Editable.Factory.getInstance().newEditable("")
                tasarim.kayitsifre.text=Editable.Factory.getInstance().newEditable("")
                Toast.makeText(requireContext(),"Başarıyla kayıt olundu...",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_kayitSayfasi_to_girisSayfasi)
            }
        }




        return tasarim.root
    }

}