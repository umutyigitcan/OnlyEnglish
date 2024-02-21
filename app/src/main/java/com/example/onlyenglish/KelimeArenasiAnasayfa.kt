package com.example.onlyenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.onlineenglish.R
import com.example.onlineenglish.databinding.FragmentKelimeArenasiAnasayfaBinding

class KelimeArenasiAnasayfa : Fragment() {

    private lateinit var tasarim:FragmentKelimeArenasiAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentKelimeArenasiAnasayfaBinding.inflate(inflater,container,false)

        tasarim.basla.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_kelimeArenasiAnasayfa_to_kelimeArenasiOyunEkrani)
        }

        return tasarim.root
    }

}