package com.example.utilisationdesfichiers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.intervention_row.view.*

class InterventionAdapter(
    var interventionFeed: ArrayList<Intervention>,
    val nContext: Context?
) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.intervention_row, parent, false)

        return CustomViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return interventionFeed.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.itemView.numero.text =interventionFeed[position].numero
        holder.itemView.nom.text =interventionFeed[position].nomPlombier
        holder.itemView.type.text =interventionFeed[position].typeIntervention
        holder.itemView.date.text =interventionFeed[position].date
    }
}


class CustomViewHolder(v: View) : RecyclerView.ViewHolder(v) {

}