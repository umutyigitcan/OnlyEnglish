package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.databinding.FragmentZamaninhikayesifragmentBinding

class Zamaninhikayesifragment : Fragment() {

    private lateinit var tasarim:FragmentZamaninhikayesifragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentZamaninhikayesifragmentBinding.inflate(inflater,container,false)

        var english = true
        tasarim.fabbutton.setOnClickListener {
            if (english) {
                tasarim.hikaye.text = getString(R.string.zamaninhikayesiturkce)
                tasarim.baslik.text = getString(R.string.zamaninhikayesiturkcebaslik)
                english = false
            } else {
                tasarim.hikaye.text = getString(R.string.zamaninhikayesiingilizce)
                tasarim.baslik.text = getString(R.string.zamaninhikayesiingilizcebaslik)
                english = true
            }
        }
        return tasarim.root
    }


}