package com.example.stime

import Score
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: List<Score>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemView.findViewById<TextView>(R.id.gameName).text = currentItem.gameName
        holder.itemView.findViewById<TextView>(R.id.topFriends).text = currentItem.topFriends
        holder.itemView.findViewById<TextView>(R.id.topFrance).text = currentItem.topFrance
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}

