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
import com.example.onlineenglish.databinding.FragmentResimliTestSekizBinding
import kotlin.random.Random


class ResimliTestSekiz : Fragment() {
    private lateinit var sorulistesi:ArrayList<Int>
    private lateinit var tasarim:FragmentResimliTestSekizBinding
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
        tasarim= FragmentResimliTestSekizBinding.inflate(inflater,container,false)
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
                    Toast.makeText(context,"Tebrikler 9.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
            }

        }

        tasarim.bsikki.setOnClickListener {

            if (tasarim.bsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 9.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
            }

        }

        tasarim.csikki.setOnClickListener {
            if (tasarim.csikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 9.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
            }

        }

        tasarim.dsikki.setOnClickListener {

            if (tasarim.dsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Leveldao().levelArttir(vt)
                    Toast.makeText(context,"Tebrikler 9.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestSekiz_to_resimliTestMenu)
            }

        }


        return tasarim.root
    }

    fun soruListesiYukleme(){
        sorulistesi.add(R.drawable.ayakkabi)
        sorulistesi.add(R.drawable.elbise)
        sorulistesi.add(R.drawable.eldiven)
        sorulistesi.add(R.drawable.esofman)
        sorulistesi.add(R.drawable.etek)
        sorulistesi.add(R.drawable.gomlek)
        sorulistesi.add(R.drawable.kazak)
        sorulistesi.add(R.drawable.kravat)
        sorulistesi.add(R.drawable.mont)
        sorulistesi.add(R.drawable.palto)
        sorulistesi.add(R.drawable.pantolon)
        sorulistesi.add(R.drawable.sapka)
        sorulistesi.add(R.drawable.sort)
        sorulistesi.add(R.drawable.tisort)
        sorulistesi.add(R.drawable.yelek)
        sorulistesi.add(R.drawable.yuzme)


    }

    fun cevapListesiYukleme(){
        cevaplistesi=ArrayList()
        cevaplistesi.add("Shoes")
        cevaplistesi.add("Dress")
        cevaplistesi.add("Gloves")
        cevaplistesi.add("Tracksuit")
        cevaplistesi.add("Skirt")
        cevaplistesi.add("Shirt")
        cevaplistesi.add("Sweater")
        cevaplistesi.add("Tie")
        cevaplistesi.add("Jacket")
        cevaplistesi.add("Coat")
        cevaplistesi.add("Pants")
        cevaplistesi.add("Hat")
        cevaplistesi.add("Shorts")
        cevaplistesi.add("T-Shirt")
        cevaplistesi.add("Vest")
        cevaplistesi.add("Swimsuit")

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