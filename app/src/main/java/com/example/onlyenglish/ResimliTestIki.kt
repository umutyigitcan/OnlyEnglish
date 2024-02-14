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
import com.example.onlineenglish.databinding.FragmentResimliTestIkiBinding
import kotlin.random.Random

class ResimliTestIki : Fragment() {
    private lateinit var sorulistesi:ArrayList<Int>
    private lateinit var cevaplistesi:ArrayList<String>
    private lateinit var mContext:Context
    var resimindex=0
    var dogrusik=0
    var dogrucevap=""
    var yanliscevap=""
    var yanliscevap2=""
    var yanliscevap3=""
    var bitis=2
    private lateinit var tasarim:FragmentResimliTestIkiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim= FragmentResimliTestIkiBinding.inflate(inflater,container,false)
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
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",
                    Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
            }

        }

        tasarim.bsikki.setOnClickListener {

            if (tasarim.bsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",
                    Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
            }

        }

        tasarim.csikki.setOnClickListener {
            if (tasarim.csikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",
                    Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
            }

        }

        tasarim.dsikki.setOnClickListener {

            if (tasarim.dsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 3.levele geçtiniz!", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",
                    Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestIki_to_resimliTestMenu)
            }

        }


        return tasarim.root
    }

    fun soruListesiYukleme(){
        sorulistesi.add(R.drawable.asci)
        sorulistesi.add(R.drawable.astronot)
        sorulistesi.add(R.drawable.berber)
        sorulistesi.add(R.drawable.doktor)
        sorulistesi.add(R.drawable.fotografci)
        sorulistesi.add(R.drawable.futbolcu)
        sorulistesi.add(R.drawable.hemsire)
        sorulistesi.add(R.drawable.insaatmuhendisi)
        sorulistesi.add(R.drawable.itfaiyeci)
        sorulistesi.add(R.drawable.jeolog)
        sorulistesi.add(R.drawable.kasap)
        sorulistesi.add(R.drawable.mimar)
        sorulistesi.add(R.drawable.ogretmen)
        sorulistesi.add(R.drawable.polis)
        sorulistesi.add(R.drawable.pompaci)
        sorulistesi.add(R.drawable.psikologg)
        sorulistesi.add(R.drawable.sofor)
        sorulistesi.add(R.drawable.veteriner)



    }

    fun cevapListesiYukleme(){
        cevaplistesi=ArrayList()
        cevaplistesi.add("Chef")
        cevaplistesi.add("Astronaut")
        cevaplistesi.add("Barber")
        cevaplistesi.add("Doctor")
        cevaplistesi.add("Photographer")
        cevaplistesi.add("Soccer Player")
        cevaplistesi.add("Nurse")
        cevaplistesi.add("Civil Engineer")
        cevaplistesi.add("Fireman")
        cevaplistesi.add("Geologist")
        cevaplistesi.add("Butcher")
        cevaplistesi.add("Architect")
        cevaplistesi.add("Teacher")
        cevaplistesi.add("Police Officer")
        cevaplistesi.add("Plumber")
        cevaplistesi.add("Psychologist")
        cevaplistesi.add("Driver")
        cevaplistesi.add("Veterinarian")


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