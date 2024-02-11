package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.databinding.FragmentKayitSayfasiBinding

class KayitSayfasi : Fragment() {

    private lateinit var tasarim:FragmentKayitSayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentKayitSayfasiBinding.inflate(inflater,container,false)



        return tasarim.root
    }

}