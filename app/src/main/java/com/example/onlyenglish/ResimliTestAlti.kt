package com.example.onlyenglish

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.onlineenglish.R
import com.example.onlineenglish.databinding.FragmentResimliTestAltiBinding
import com.example.onlineenglish.databinding.FragmentResimliTestBirBinding
import kotlin.random.Random


class ResimliTestAlti : Fragment() {
    private lateinit var sorulistesi:ArrayList<Int>
    private lateinit var tasarim:FragmentResimliTestAltiBinding
    private lateinit var cevaplistesi:ArrayList<String>
    private lateinit var mContext:Context
    var resimindex=0
    var dogrusik=0
    var dogrucevap=""
    var yanliscevap=""
    var yanliscevap2=""
    var yanliscevap3=""
    var bitis=2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentResimliTestAltiBinding.inflate(inflater,container,false)
        mContext=requireContext()
        var vt=VeritabaniYardimcisiLevel(mContext)

        cevaplistesi=ArrayList()
        cevapListesiYukleme()
        sorulistesi=ArrayList<Int>()
        soruListesiYukleme()

        soruYukle()

        tasarim.asikki.setOnClickListener {
            if (tasarim.asikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 7.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
            }

        }

        tasarim.bsikki.setOnClickListener {

            if (tasarim.bsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 7.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
            }

        }

        tasarim.csikki.setOnClickListener {
            if (tasarim.csikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 7.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
            }

        }

        tasarim.dsikki.setOnClickListener {

            if (tasarim.dsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 7.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestAlti_to_resimliTestMenu)
            }

        }


        return tasarim.root
    }

    fun soruListesiYukleme(){
        sorulistesi.add(R.drawable.bulutlu)
        sorulistesi.add(R.drawable.firtinali)
        sorulistesi.add(R.drawable.gunesli)
        sorulistesi.add(R.drawable.karli)
        sorulistesi.add(R.drawable.parcali)
        sorulistesi.add(R.drawable.ruzgarli)
        sorulistesi.add(R.drawable.sisli)
        sorulistesi.add(R.drawable.yagmurlu)
        sorulistesi.add(R.drawable.dolu)



    }

    fun cevapListesiYukleme(){
        cevaplistesi.add("Cloudy")
        cevaplistesi.add("Stormy")
        cevaplistesi.add("Sunny")
        cevaplistesi.add("Snowy")
        cevaplistesi.add("Partly Cloudy")
        cevaplistesi.add("Windy")
        cevaplistesi.add("Foggy")
        cevaplistesi.add("Rainy")
        cevaplistesi.add("Hail")

    }


    fun soruYukle(){
        resimindex= Random.nextInt(0,sorulistesi.size)
        tasarim.resim.setImageResource(sorulistesi[resimindex])
        dogrucevap=cevaplistesi[resimindex]
        dogrusik= Random.nextInt(0,4)
        yanliscevap=cevaplistesi[Random.nextInt(0,cevaplistesi.size)]
        while(dogrucevap==yanliscevap){
            yanliscevap=cevaplistesi[Random.nextInt(0,cevaplistesi.size)]
        }
        yanliscevap2=cevaplistesi[Random.nextInt(0,cevaplistesi.size)]
        while (yanliscevap2==dogrucevap || yanliscevap2==yanliscevap){
            yanliscevap2=cevaplistesi[Random.nextInt(0,cevaplistesi.size)]
        }
        yanliscevap3=cevaplistesi[Random.nextInt(0,cevaplistesi.size)]
        while (yanliscevap3==yanliscevap2 || yanliscevap3==yanliscevap || yanliscevap3==dogrucevap){
            yanliscevap3=cevaplistesi[Random.nextInt(0,cevaplistesi.size)]
        }
        when(dogrusik){
            0->{tasarim.asikki.text=dogrucevap
                tasarim.bsikki.text=yanliscevap
                tasarim.csikki.text=yanliscevap2
                tasarim.dsikki.text=yanliscevap3
            }
            1->{tasarim.bsikki.text=dogrucevap
                tasarim.asikki.text=yanliscevap
                tasarim.csikki.text=yanliscevap2
                tasarim.dsikki.text=yanliscevap3
            }
            2->{tasarim.csikki.text=dogrucevap
                tasarim.asikki.text=yanliscevap
                tasarim.bsikki.text=yanliscevap2
                tasarim.dsikki.text=yanliscevap3}
            3->{tasarim.dsikki.text=dogrucevap
                tasarim.asikki.text=yanliscevap
                tasarim.bsikki.text=yanliscevap2
                tasarim.csikki.text=yanliscevap3}
        }

    }


}