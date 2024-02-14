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
import com.example.onlineenglish.databinding.FragmentResimliTestBesBinding
import com.example.onlineenglish.databinding.FragmentResimliTestBirBinding
import kotlin.random.Random


class ResimliTestBes : Fragment() {
    private lateinit var sorulistesi:ArrayList<Int>
    private lateinit var tasarim:FragmentResimliTestBesBinding
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
        tasarim= FragmentResimliTestBesBinding.inflate(inflater,container,false)
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
                    Toast.makeText(context,"Tebrikler 6.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
            }

        }

        tasarim.bsikki.setOnClickListener {

            if (tasarim.bsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 6.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
            }

        }

        tasarim.csikki.setOnClickListener {
            if (tasarim.csikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 6.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
            }

        }

        tasarim.dsikki.setOnClickListener {

            if (tasarim.dsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 6.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBes_to_resimliTestMenu)
            }

        }


        return tasarim.root
    }

    fun soruListesiYukleme(){
        sorulistesi.add(R.drawable.araba)
        sorulistesi.add(R.drawable.bisiklet)
        sorulistesi.add(R.drawable.denizalti)
        sorulistesi.add(R.drawable.feribot)
        sorulistesi.add(R.drawable.gemi)
        sorulistesi.add(R.drawable.helikopter)
        sorulistesi.add(R.drawable.jet)
        sorulistesi.add(R.drawable.jetski)
        sorulistesi.add(R.drawable.kamyon)
        sorulistesi.add(R.drawable.karavan)
        sorulistesi.add(R.drawable.minibus)
        sorulistesi.add(R.drawable.monoray)
        sorulistesi.add(R.drawable.motorsiklet)
        sorulistesi.add(R.drawable.otobus)
        sorulistesi.add(R.drawable.scooter)
        sorulistesi.add(R.drawable.travmay)
        sorulistesi.add(R.drawable.tren)
        sorulistesi.add(R.drawable.ucak)
        sorulistesi.add(R.drawable.yat)
        sorulistesi.add(R.drawable.yelkenli)



    }

    fun cevapListesiYukleme(){
        cevaplistesi=ArrayList()
        cevaplistesi.add("Car")
        cevaplistesi.add("Bicycle")
        cevaplistesi.add("Submarine")
        cevaplistesi.add("Ferry")
        cevaplistesi.add("Ship")
        cevaplistesi.add("Helicopter")
        cevaplistesi.add("Jet")
        cevaplistesi.add("Jet Ski")
        cevaplistesi.add("Truck")
        cevaplistesi.add("Caravan")
        cevaplistesi.add("Minibus")
        cevaplistesi.add("Monorail")
        cevaplistesi.add("Motorcycle")
        cevaplistesi.add("Bus")
        cevaplistesi.add("Scooter")
        cevaplistesi.add("Tram")
        cevaplistesi.add("Train")
        cevaplistesi.add("Plane")
        cevaplistesi.add("Yacht")
        cevaplistesi.add("Sailboat")

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