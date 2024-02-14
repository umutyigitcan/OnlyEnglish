package com.example.onlineenglish

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.onlineenglish.databinding.FragmentAnamenuBinding

class Anamenu : Fragment() {

    private lateinit var tasarim: FragmentAnamenuBinding
    private lateinit var myHandler:Handler
    private lateinit var myRunnable: Runnable
    var sayi=0
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

        myHandler= Handler(Looper.getMainLooper())
        myRunnable=object :Runnable{
            override fun run() {
                sayi++
                when (sayi){
                    1->{
                        tasarim.butonbir.setBackgroundResource(R.drawable.aaa)
                        tasarim.butoniki.setBackgroundResource(R.drawable.aaaiki)
                        tasarim.butonuc.setBackgroundResource(R.drawable.aaauc)
                        tasarim.butondRt.setBackgroundResource(R.drawable.aaadort)
                        tasarim.sohbet.setBackgroundResource(R.drawable.aaabes)
                    }
                    2->{
                        tasarim.butonbir.setBackgroundResource(R.drawable.aaaiki)
                        tasarim.butoniki.setBackgroundResource(R.drawable.aaauc)
                        tasarim.butonuc.setBackgroundResource(R.drawable.aaadort)
                        tasarim.butondRt.setBackgroundResource(R.drawable.aaabes)
                        tasarim.sohbet.setBackgroundResource(R.drawable.aaa)
                    }
                    3->{
                        tasarim.butonbir.setBackgroundResource(R.drawable.aaauc)
                        tasarim.butoniki.setBackgroundResource(R.drawable.aaadort)
                        tasarim.butonuc.setBackgroundResource(R.drawable.aaabes)
                        tasarim.butondRt.setBackgroundResource(R.drawable.aaa)
                        tasarim.sohbet.setBackgroundResource(R.drawable.aaaiki)
                    }
                    4->{
                        tasarim.butonbir.setBackgroundResource(R.drawable.aaadort)
                        tasarim.butoniki.setBackgroundResource(R.drawable.aaabes)
                        tasarim.butonuc.setBackgroundResource(R.drawable.aaa)
                        tasarim.butondRt.setBackgroundResource(R.drawable.aaaiki)
                        tasarim.sohbet.setBackgroundResource(R.drawable.aaauc)
                        sayi=0
                    }
                }
                myHandler.postDelayed(this,1000)
            }
        }

        myHandler.post(myRunnable)






        return tasarim.root
    }
}
