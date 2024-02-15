package com.example.onlyenglish

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineenglish.R
import com.example.onlineenglish.VeriTabaniYardimcisi

class RVAdapter(var mContext: Context,var kelimeListe:List<SozlukData>):RecyclerView.Adapter<RVAdapter.cardViewNesneTutucu>() {
    inner class cardViewNesneTutucu(view:View):RecyclerView.ViewHolder(view){

        var vt=VeriTabaniYardimcisi(mContext)

        var satirCardView:CardView
        var kelimeingilizce:TextView
        var kelimeturkce:TextView

        init {
            satirCardView=view.findViewById(R.id.satirCardView)
            kelimeingilizce=view.findViewById(R.id.kelimeingilizce)
            kelimeturkce=view.findViewById(R.id.kelimeturkce)


        }
    }

    override fun onBindViewHolder(holder: cardViewNesneTutucu, position: Int) {
        var data=kelimeListe[position]
        holder.kelimeingilizce.text=data.kelimeturkce
        holder.kelimeturkce.text=data.kelimeingilizce

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewNesneTutucu {
        var tasarim=LayoutInflater.from(mContext).inflate(R.layout.kelimecardtasarim,parent,false)
        return cardViewNesneTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kelimeListe.size
    }
}