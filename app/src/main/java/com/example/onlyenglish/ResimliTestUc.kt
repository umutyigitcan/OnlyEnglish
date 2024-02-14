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
import com.example.onlineenglish.databinding.FragmentResimliTestBirBinding
import com.example.onlineenglish.databinding.FragmentResimliTestUcBinding
import kotlin.random.Random


class ResimliTestUc : Fragment() {
    private lateinit var sorulistesi:ArrayList<Int>
    private lateinit var tasarim:FragmentResimliTestUcBinding
    private lateinit var cevaplistesi:ArrayList<String>
    private lateinit var mContext: Context
    var resimindex=0
    var dogrusik=0
    var dogrucevap=""
    var yanliscevap=""
    var yanliscevap2=""
    var yanliscevap3=""
    var bitis=2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentResimliTestUcBinding.inflate(inflater,container,false)
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
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
            }

        }

        tasarim.bsikki.setOnClickListener {

            if (tasarim.bsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
            }

        }

        tasarim.csikki.setOnClickListener {
            if (tasarim.csikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
            }

        }

        tasarim.dsikki.setOnClickListener {

            if (tasarim.dsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestUc_to_resimliTestMenu)
            }

        }


        return tasarim.root
    }

    fun soruListesiYukleme(){
        sorulistesi.add(R.drawable.alisveris)
        sorulistesi.add(R.drawable.berber)
        sorulistesi.add(R.drawable.cami)
        sorulistesi.add(R.drawable.firin)
        sorulistesi.add(R.drawable.fotografci)
        sorulistesi.add(R.drawable.galeri)
        sorulistesi.add(R.drawable.guzellik)
        sorulistesi.add(R.drawable.hamam)
        sorulistesi.add(R.drawable.hastane)
        sorulistesi.add(R.drawable.havalimani)
        sorulistesi.add(R.drawable.kasap)
        sorulistesi.add(R.drawable.kafe)
        sorulistesi.add(R.drawable.kilise)
        sorulistesi.add(R.drawable.kutuphane)
        sorulistesi.add(R.drawable.lunapark)
        sorulistesi.add(R.drawable.market)
        sorulistesi.add(R.drawable.mezarlik)
        sorulistesi.add(R.drawable.muze)
        sorulistesi.add(R.drawable.okul)
        sorulistesi.add(R.drawable.otel)
        sorulistesi.add(R.drawable.park)
        sorulistesi.add(R.drawable.plaj)
        sorulistesi.add(R.drawable.restoran)
        sorulistesi.add(R.drawable.sinema)
        sorulistesi.add(R.drawable.stadyum)
        sorulistesi.add(R.drawable.spor)
        sorulistesi.add(R.drawable.tiyatro)

    }

    fun cevapListesiYukleme(){
        cevaplistesi=ArrayList()
        cevaplistesi.add("Shopping Mall")
        cevaplistesi.add("Barber Shop")
        cevaplistesi.add("Mosque")
        cevaplistesi.add("Bakery")
        cevaplistesi.add("Photographer's Studio")
        cevaplistesi.add("Car Gallery")
        cevaplistesi.add("Beauty Salon")
        cevaplistesi.add("Turkish Bath")
        cevaplistesi.add("Hospital")
        cevaplistesi.add("Airport")
        cevaplistesi.add("Buthcer Shop")
        cevaplistesi.add("Cafe")
        cevaplistesi.add("Church")
        cevaplistesi.add("Library")
        cevaplistesi.add("Amusement Park")
        cevaplistesi.add("Grocery")
        cevaplistesi.add("Cemetery")
        cevaplistesi.add("Museum")
        cevaplistesi.add("School")
        cevaplistesi.add("Hotel")
        cevaplistesi.add("Park")
        cevaplistesi.add("Beach")
        cevaplistesi.add("Restaurant")
        cevaplistesi.add("Cinema")
        cevaplistesi.add("Stadium")
        cevaplistesi.add("Gym")
        cevaplistesi.add("Theater")

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