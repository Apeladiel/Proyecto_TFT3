package com.example.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCompoBinding
import com.squareup.picasso.Picasso

class CompoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = ItemCompoBinding.bind(itemView)

    fun bind(compoModel: Compo){

        binding.Composicion.text=compoModel.nombre
        Picasso.get()
            .load(compoModel.image)
            .into(binding.imageView)
        binding.Tier.text=compoModel.tier
        binding.champions.text=compoModel.champions


    }

}
