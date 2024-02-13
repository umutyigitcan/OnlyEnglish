package com.example.onlineenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.onlineenglish.databinding.FragmentAnamenuBinding

class Anamenu : Fragment() {

    private lateinit var tasarim: FragmentAnamenuBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnamenuBinding.inflate(inflater, container, false)

       /* val bundle: AnamenuArgs by navArgs()
        val gelenkullaniciadi=bundle.kullaniciadi
        tasarim.kullaniciadi.text = gelenkullaniciadi */
        tasarim.butonuc.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anamenu_to_hikayeler)
        }
        tasarim.butonbir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anamenu_to_kelimeKuizAnasayfa)
        }
        tasarim.butoniki.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anamenu_to_resimliTestMenu)
        }




        return tasarim.root
    }
}
