package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.onlineenglish.databinding.FragmentHikayelerBinding

class Hikayeler : Fragment() {

    private lateinit var tasarim:FragmentHikayelerBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentHikayelerBinding.inflate(inflater,container,false)

        tasarim.hikayebir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_hikayeler_to_ormaninSirlariHikaye)
        }

        tasarim.hikayeiki.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_hikayeler_to_buyuluOrmanHikaye)
        }

        tasarim.hikayeuc.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_hikayeler_to_zamaninhikayesifragment)
        }

        tasarim.hikayedort.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_hikayeler_to_unutulmusKutuphane)
        }

        tasarim.hikayebes.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_hikayeler_to_yoldakiRuya)
        }

        tasarim.cikis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_hikayeler_to_anamenu)
        }




        return tasarim.root
    }

}