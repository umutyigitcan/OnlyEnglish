package com.example.onlyenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.onlineenglish.R
import com.example.onlineenglish.databinding.FragmentResimliTestBirBinding
import com.example.onlineenglish.databinding.FragmentResimliTestDortBinding
import kotlin.random.Random


class ResimliTestDort : Fragment() {
    private lateinit var sorulistesi:ArrayList<Int>
    private lateinit var tasarim:FragmentResimliTestDortBinding
    private lateinit var cevaplistesi:ArrayList<String>
    var resimindex=0
    var dogrusik=0
    var dogrucevap=""
    var yanliscevap=""
    var yanliscevap2=""
    var yanliscevap3=""
    var bitis=250
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentResimliTestDortBinding.inflate(inflater,container,false)

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
                    Toast.makeText(context,"Tebrikler 2.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
            }

        }

        tasarim.bsikki.setOnClickListener {

            if (tasarim.bsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Toast.makeText(context,"Tebrikler 2.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
            }

        }

        tasarim.csikki.setOnClickListener {
            if (tasarim.csikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Toast.makeText(context,"Tebrikler 2.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
            }

        }

        tasarim.dsikki.setOnClickListener {

            if (tasarim.dsikki.text == dogrucevap) {
                Toast.makeText(context, "Doğru Cevap!", Toast.LENGTH_SHORT).show()
                soruYukle()
                bitis--
                if(bitis==0){
                    Toast.makeText(context,"Tebrikler 2.levele geçtiniz!",Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
                }
            }
            else{
                Toast.makeText(context,"Yanlış cevap verdiğiniz için\nanasayfaya döndürülüyorsunuz!",Toast.LENGTH_SHORT).show()
                Navigation.findNavController(it).navigate(R.id.action_resimliTestBir_to_resimliTestMenu)
            }

        }


        return tasarim.root
    }

    fun soruListesiYukleme(){
        sorulistesi.add(R.drawable.ahtopot)
        sorulistesi.add(R.drawable.akrep)
        sorulistesi.add(R.drawable.ari)
        sorulistesi.add(R.drawable.aslan)
        sorulistesi.add(R.drawable.ayi)
        sorulistesi.add(R.drawable.balina)
        sorulistesi.add(R.drawable.baykus)
        sorulistesi.add(R.drawable.ceylan)
        sorulistesi.add(R.drawable.denizati)
        sorulistesi.add(R.drawable.fare)
        sorulistesi.add(R.drawable.fil)
        sorulistesi.add(R.drawable.groil)
        sorulistesi.add(R.drawable.kanguru)
        sorulistesi.add(R.drawable.kaplan)
        sorulistesi.add(R.drawable.karides)
        sorulistesi.add(R.drawable.kartal)
        sorulistesi.add(R.drawable.kedi)
        sorulistesi.add(R.drawable.kelebek)
        sorulistesi.add(R.drawable.kirpi)
        sorulistesi.add(R.drawable.kopek)
        sorulistesi.add(R.drawable.koyun)
        sorulistesi.add(R.drawable.kugu)
        sorulistesi.add(R.drawable.ordek)
        sorulistesi.add(R.drawable.panda)
        sorulistesi.add(R.drawable.papagan)
        sorulistesi.add(R.drawable.penguen)
        sorulistesi.add(R.drawable.sincap)
        sorulistesi.add(R.drawable.tavuk)
        sorulistesi.add(R.drawable.tavsan)
        sorulistesi.add(R.drawable.timsah)
        sorulistesi.add(R.drawable.tirtil)
        sorulistesi.add(R.drawable.yilan)
        sorulistesi.add(R.drawable.zebra)
        sorulistesi.add(R.drawable.zurafa)



    }

    fun cevapListesiYukleme(){
        cevaplistesi=ArrayList()
        cevaplistesi.add("Octopus")
        cevaplistesi.add("Scorpion")
        cevaplistesi.add("Bee")
        cevaplistesi.add("Lion")
        cevaplistesi.add("Bear")
        cevaplistesi.add("Whale")
        cevaplistesi.add("Owl")
        cevaplistesi.add("Deer")
        cevaplistesi.add("Seahorse")
        cevaplistesi.add("Mouse")
        cevaplistesi.add("Elephant")
        cevaplistesi.add("Gorilla")
        cevaplistesi.add("Kangaroo")
        cevaplistesi.add("Tiger")
        cevaplistesi.add("Shrimp")
        cevaplistesi.add("Eagle")
        cevaplistesi.add("Cat")
        cevaplistesi.add("Butterfly")
        cevaplistesi.add("Hedgehog")
        cevaplistesi.add("Dog")
        cevaplistesi.add("Sheep")
        cevaplistesi.add("Swan")
        cevaplistesi.add("Duck")
        cevaplistesi.add("Panda")
        cevaplistesi.add("Parrot")
        cevaplistesi.add("Penguin")
        cevaplistesi.add("Squirrel")
        cevaplistesi.add("Chicken")
        cevaplistesi.add("Rabbit")
        cevaplistesi.add("Crocodile")
        cevaplistesi.add("Caterpillar")
        cevaplistesi.add("Snake")
        cevaplistesi.add("Zebra")
        cevaplistesi.add("Giraffe")

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