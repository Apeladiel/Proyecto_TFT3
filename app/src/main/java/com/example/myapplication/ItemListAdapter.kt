package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemListAdapter(private val ListaCompo: MutableList<Compo>) : RecyclerView.Adapter<CompoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CompoViewHolder(layoutInflater.inflate(R.layout.item_compo, parent, false))
    }

    override fun getItemCount(): Int {
        return ListaCompo.size
    }

    override fun onBindViewHolder(holder: CompoViewHolder, position: Int) {
        val compo = ListaCompo[position]
        holder.bind(compo)

        holder.itemView.setOnClickListener {
            val url = "https://tftactics.gg/tierlist/team-comps"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            val context = holder.itemView.context

            context.startActivity(intent)
        }
    }
}
