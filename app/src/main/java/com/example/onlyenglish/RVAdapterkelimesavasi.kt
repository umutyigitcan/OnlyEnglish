package com.example.onlyenglish

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.onlineenglish.R

class RVAdapterkelimesavasi(var mContext:Context,var Datalar:List<DatalarKelimeSavasi>):RecyclerView.Adapter<RVAdapterkelimesavasi.cardViewNesneTutucu>() {
    inner class cardViewNesneTutucu(view:View):RecyclerView.ViewHolder(view){
        var satirCardViewiki:CardView
        var solcevap:TextView
        var onaytik:ImageView
        var hatatik:ImageView
        var sagcevap:TextView
        init{
            satirCardViewiki=view.findViewById(R.id.satirCardViewiki)
            solcevap = view.findViewById(R.id.solcevap)
            onaytik=view.findViewById(R.id.onaytik)
            hatatik=view.findViewById(R.id.hatatik)
            sagcevap=view.findViewById(R.id.sagcevap)

        }
    }

    override fun onBindViewHolder(holder: cardViewNesneTutucu, position: Int) {
        var gelen=Datalar[position]




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewNesneTutucu {
        var tasarim=LayoutInflater.from(mContext).inflate(R.layout.kelimearenasicardtasarimi,parent,false)
        return cardViewNesneTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return Datalar.size
    }
}