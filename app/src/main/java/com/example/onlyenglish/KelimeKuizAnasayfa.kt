package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.onlineenglish.databinding.FragmentKelimeKuizAnasayfaBinding

class KelimeKuizAnasayfa : Fragment() {

    private lateinit var tasarim:FragmentKelimeKuizAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentKelimeKuizAnasayfaBinding.inflate(inflater,container,false)
        tasarim.butonbir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_kelimeKuizAnasayfa_to_kelimeKuiz)
        }

        tasarim.butoniki.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_kelimeKuizAnasayfa_to_yanlisYapilanKelimeler)
        }



        tasarim.butondort.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_kelimeKuizAnasayfa_to_anamenu)
        }


        return tasarim.root
    }

}