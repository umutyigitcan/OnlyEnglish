package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.databinding.FragmentUnutulmusKutuphaneBinding

class UnutulmusKutuphane : Fragment() {

    private lateinit var tasarim:FragmentUnutulmusKutuphaneBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentUnutulmusKutuphaneBinding.inflate(inflater,container,false)


        var english = true
        tasarim.fabbutton.setOnClickListener {
            if (english) {
                tasarim.hikaye.text = getString(R.string.unutulmuskutuphaneturkce)
                tasarim.baslik.text = getString(R.string.unutulmuskutuphaneturkcebaslik)
                english = false
            } else {
                tasarim.hikaye.text = getString(R.string.unutulmuskutuphaneingilizce)
                tasarim.baslik.text = getString(R.string.unutulmuskutuphaneingilizcebaslik)
                english = true
            }
        }

        return tasarim.root
    }

}