package com.example.onlyenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.onlineenglish.R
import com.example.onlineenglish.databinding.FragmentResimliTestMenuBinding

class ResimliTestMenu : Fragment() {

    private lateinit var tasarim:FragmentResimliTestMenuBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentResimliTestMenuBinding.inflate(inflater,container,false)

        tasarim.birincitest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestBir)
        }

        tasarim.ikincitest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestIki)
        }

        tasarim.ucuncutest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestUc)
        }

        tasarim.dorduncutest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestDort)
        }

        tasarim.besincitest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestBes)
        }

        tasarim.altincitest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestAlti)
        }

        tasarim.yedincitest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestYedi)
        }

        tasarim.sekizincitest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestSekiz)
        }

        tasarim.dokuzuncutest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestDokuz)
        }




        return tasarim.root
    }


}