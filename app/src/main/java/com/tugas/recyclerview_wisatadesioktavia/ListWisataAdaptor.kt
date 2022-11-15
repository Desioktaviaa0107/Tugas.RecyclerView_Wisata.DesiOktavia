package com.tugas.recyclerview_wisatadesioktavia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_row_wisata.view.*

class ListWisataAdaptor(private val listWisata: ArrayList<Wisata>): RecyclerView.Adapter<ListWisataAdaptor.ListViewHolder>() {

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvJudulWisata = itemView.tv_wisata
        var tvDetail = itemView.tv_deskripsi
        var imgWisata = itemView.iv_wisata

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val  view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_wisata, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide .with(holder.itemView.context)
            .load(wisata.img)
            .into(holder.imgWisata)

        holder.tvJudulWisata.text = wisata.wisata
        holder.tvDetail.text = wisata.detail
    }
}