package com.adit_saputra.t

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adit_saputra.t.Adapter.galeriAdapter
import com.adit_saputra.t.Model.galeriModel
import java.util.ArrayList


class GP_Activity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var galeriAdapter: galeriAdapter? =null
    private var galeriList = mutableListOf<galeriModel>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_gp)
        galeriList = ArrayList()
        recyclerView = findViewById(R.id.rv_galeri)
        galeriAdapter = galeriAdapter(this, galeriList)
        val LayoutManager: RecyclerView.LayoutManager = GridLayoutManager(
            this, 2
        )
        recyclerView!!.layoutManager = LayoutManager
        recyclerView!!.adapter =galeriAdapter
      preparegaleriList()
    }
    private fun preparegaleriList() {
        var galeri = galeriModel("avatar", R.drawable.dua)
        galeriList.add(galeri)
        galeri = galeriModel("empat", R.drawable.empat)
        galeriList.add(galeri)
        galeri = galeriModel("enam", R.drawable.enam)
        galeriList.add(galeri)
        galeri = galeriModel("limaa", R.drawable.lima)
        galeriList.add(galeri)
        galeriAdapter!!.notifyDataSetChanged()
    }
}