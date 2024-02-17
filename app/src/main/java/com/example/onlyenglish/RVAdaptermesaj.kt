package com.example.onlyenglish

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineenglish.R



class RVAdaptermesaj(var mContext:Context,var mesajlar:List<Mesajdata>):RecyclerView.Adapter<RVAdaptermesaj.cardViewNesneleriniTutucu>() {

    inner class cardViewNesneleriniTutucu(view:View):RecyclerView.ViewHolder(view){

        var satirCardView:CardView
        var mesaj:TextView

        init {
            satirCardView=view.findViewById(R.id.satirCardView)
            mesaj=view.findViewById(R.id.mesaj)
        }
    }

    override fun onBindViewHolder(holder: cardViewNesneleriniTutucu, position: Int) {
        var mesajlar=mesajlar[position]
        holder.mesaj.text=mesajlar.mesaj

    }

    override fun getItemCount(): Int {
        return mesajlar.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewNesneleriniTutucu {

        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.sohbetbaloncugu, parent, false)
        return cardViewNesneleriniTutucu(tasarim)
    }


}