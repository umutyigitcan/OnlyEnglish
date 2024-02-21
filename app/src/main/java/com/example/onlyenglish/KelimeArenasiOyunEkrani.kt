package com.example.onlyenglish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.onlineenglish.R
import com.example.onlineenglish.databinding.FragmentKelimeArenasiOyunEkraniBinding
class KelimeArenasiOyunEkrani : Fragment() {

    private lateinit var tasarim: FragmentKelimeArenasiOyunEkraniBinding
    private lateinit var datalar: ArrayList<DatalarKelimeSavasi>
    private lateinit var adapter: RVAdapterkelimesavasi

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentKelimeArenasiOyunEkraniBinding.inflate(inflater, container, false)
        tasarim.rv.setHasFixedSize(true)
        datalar = ArrayList()


        adapter = RVAdapterkelimesavasi(requireContext(), datalar)
        tasarim.rv.adapter = adapter

        tasarim.rv.scrollToPosition(adapter.itemCount - 1)
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        tasarim.gonder.setOnClickListener {
            var gonderilen = tasarim.cevap.text.toString()
            datalar.add(DatalarKelimeSavasi(gonderilen))
            adapter.notifyDataSetChanged()
        }

        return tasarim.root
    }
}
