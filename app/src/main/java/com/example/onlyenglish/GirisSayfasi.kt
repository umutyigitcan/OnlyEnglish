package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.onlineenglish.databinding.FragmentGirisSayfasiBinding

class GirisSayfasi : Fragment() {
    private lateinit var tasarim:FragmentGirisSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentGirisSayfasiBinding.inflate(inflater,container,false)






        tasarim.giris.setOnClickListener {

            var gecis=GirisSayfasiDirections.actionGirisSayfasiToAnamenu("Anasayfa")
            Navigation.findNavController(it).navigate(gecis)


        }

        tasarim.kayit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_girisSayfasi_to_kayitSayfasi)
        }







        return tasarim.root
    }
}