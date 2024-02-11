package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.databinding.FragmentOrmaninSirlariHikayeBinding

class OrmaninSirlariHikaye : Fragment() {

    private lateinit var tasarim:FragmentOrmaninSirlariHikayeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentOrmaninSirlariHikayeBinding.inflate(inflater,container,false)

        var english = true
        tasarim.fabbutton.setOnClickListener {
            if (english) {
                tasarim.hikaye.text = getString(R.string.ormaninsirlariturkce)
                tasarim.baslik.text = getString(R.string.ormaninsirlaribaslikturkce)
                english = false
            } else {
                tasarim.hikaye.text = getString(R.string.ormaninsirlariingilizce)
                tasarim.baslik.text = getString(R.string.ormaninsirlaribaslikingilizce)
                english = true
            }
        }

        return tasarim.root
    }

}