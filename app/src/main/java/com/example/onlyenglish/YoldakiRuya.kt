package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onlineenglish.databinding.FragmentYoldakiRuyaBinding

class YoldakiRuya : Fragment() {
    private lateinit var tasarim:FragmentYoldakiRuyaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentYoldakiRuyaBinding.inflate(inflater,container,false)

        var english = true
        tasarim.fabbutton.setOnClickListener {
            if (english) {
                tasarim.hikaye.text = getString(R.string.yoldakiruyaturkce)
                tasarim.baslik.text = getString(R.string.yoldakiruyaturkcebaslik)
                english = false
            } else {
                tasarim.hikaye.text = getString(R.string.yoldakiruyaingilizce)
                tasarim.baslik.text = getString(R.string.yoldakiruyaingilizcebaslik)
                english = true
            }
        }


        return tasarim.root
    }


}