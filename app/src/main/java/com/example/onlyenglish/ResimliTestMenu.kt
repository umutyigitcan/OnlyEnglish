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
import com.example.onlineenglish.databinding.FragmentResimliTestMenuBinding

class ResimliTestMenu : Fragment() {

    private lateinit var tasarim:FragmentResimliTestMenuBinding
    private lateinit var mContext:Context
    var levelbilgi=0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim= FragmentResimliTestMenuBinding.inflate(inflater,container,false)
        mContext=requireContext()
        var vt=VeritabaniYardimcisiLevel(mContext)


        var leveldurumm=Leveldao().levelDurum(vt)
        for(k in leveldurumm){
            levelbilgi=k.leveldurum
            tasarim.textview.text="Mevcut Level: ${levelbilgi.toString()}"
        }

        when(levelbilgi){
            1->{
                tasarim.birincitest.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestBir)
                }
                tasarim.ikincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.ucuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dorduncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.besincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            2->{
                tasarim.birincitest.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestBir)
                }
                tasarim.ikincitest.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestIki)
                }
                tasarim.ucuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dorduncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.besincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }

            3->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.besincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            4->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            5->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            6->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            7->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            8->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            9->{
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
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapenow)
            }
            else->{
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
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
            }

        }

        tasarim.levelarttir.setOnClickListener {
            Leveldao().levelArttir(vt)
            if (levelbilgi<1){
                Leveldao().levelArttir(vt)
            }
            if(levelbilgi>10){
                Leveldao().levelAzalt(vt)
            }
            anlikYenileme()
            tasarim.textview.text="Mevcut Level: ${levelbilgi.toString()}"
        }

        tasarim.levelazalt.setOnClickListener {
            Leveldao().levelAzalt(vt)
            if (levelbilgi<1){
                Leveldao().levelArttir(vt)
            }
            if(levelbilgi>10){
                Leveldao().levelAzalt(vt)
            }
            anlikYenileme()
            tasarim.textview.text="Mevcut Level: ${levelbilgi.toString()}"

        }







        return tasarim.root
    }

    fun anlikYenileme(){
        var vt=VeritabaniYardimcisiLevel(mContext)
        var leveldurumm=Leveldao().levelDurum(vt)
        for(k in leveldurumm){
            levelbilgi=k.leveldurum
        }

        when(levelbilgi){
            1->{
                tasarim.birincitest.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestBir)
                }
                tasarim.ikincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.ucuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dorduncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.besincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            2->{
                tasarim.birincitest.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestBir)
                }
                tasarim.ikincitest.setOnClickListener {
                    Navigation.findNavController(it).navigate(R.id.action_resimliTestMenu_to_resimliTestIki)
                }
                tasarim.ucuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dorduncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.besincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }

            3->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.besincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            4->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.altincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            5->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.yedincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            6->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.sekizincitest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            7->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }

                tasarim.dokuzuncutest.setOnClickListener {
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapekirmizi)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            8->{
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
                    Toast.makeText(mContext,"Önceki levelleri tamamlayınız...",Toast.LENGTH_SHORT).show()
                }
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapenow)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapekirmizi)
            }
            9->{
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
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapenow)
            }
            10->{
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
                tasarim.birincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ikincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.ucuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dorduncutest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.besincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.altincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.yedincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.sekizincitest.setBackgroundResource(R.drawable.levelshapeyesil)
                tasarim.dokuzuncutest.setBackgroundResource(R.drawable.levelshapeyesil)
            }
            else->{
                if (levelbilgi<1){
                    Leveldao().levelArttir(vt)
                }
                if(levelbilgi>10){
                    Leveldao().levelAzalt(vt)
                }
            }

        }

    }


}