package com.adit_saputra.t.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.adit_saputra.t.GP_Activity
import com.adit_saputra.t.Model.galeriModel
import com.adit_saputra.t.R

class galeriAdapter constructor(
    private val getActivity: GP_Activity,
    private val galeriList: List<galeriModel>

) : RecyclerView.Adapter<galeriAdapter.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.txtgaleri)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val cardModelgaleri: CardView = itemView.findViewById(R.id.cardgaleri)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_galeri_card, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return galeriList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = galeriList[position].title
        holder.imageView.setImageResource(galeriList[position].image)

        holder.cardModelgaleri.setOnClickListener() {
            Toast.makeText(getActivity, galeriList[position].title, Toast.LENGTH_SHORT).show()
        }


    }
}