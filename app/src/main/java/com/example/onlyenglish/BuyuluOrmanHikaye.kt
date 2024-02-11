package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.databinding.FragmentBuyuluOrmanHikayeBinding

class BuyuluOrmanHikaye : Fragment() {

    private lateinit var tasarim:FragmentBuyuluOrmanHikayeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim= FragmentBuyuluOrmanHikayeBinding.inflate(inflater,container,false)


        var english = true
        tasarim.fabbutton.setOnClickListener {
            if (english) {
                tasarim.hikaye.text = getString(R.string.BüyülüOrmanturkce)
                tasarim.baslik.text = getString(R.string.buyuluormanturkcebaslik)
                english = false
            } else {
                tasarim.hikaye.text = getString(R.string.Buyuluormaningilizce)
                tasarim.baslik.text = getString(R.string.buyuluormaningilizcebaslik)
                english = true
            }
        }




        return tasarim.root
    }


}