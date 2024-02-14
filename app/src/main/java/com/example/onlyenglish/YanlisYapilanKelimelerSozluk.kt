package com.example.onlyenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.R
import com.example.onlineenglish.databinding.FragmentYanlisYapilanKelimelerSozlukBinding

class YanlisYapilanKelimelerSozluk : Fragment() {

    private lateinit var tasarim:FragmentYanlisYapilanKelimelerSozlukBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentYanlisYapilanKelimelerSozlukBinding.inflate(inflater,container,false)




        return tasarim.root
    }

}