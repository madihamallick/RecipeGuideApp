package com.example.recipeguideapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeguideapp.databinding.CardViewRecipeBinding

class cardAdapter(private val recipe: List<Recipe>,
                  private val clickListener: Recipeclicklistener
                  ):RecyclerView.Adapter<cardviewholder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardviewholder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardViewRecipeBinding.inflate(from,parent,false)
        return cardviewholder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: cardviewholder, position: Int) {
        holder.bindrecipe(recipe[position])
    }

    override fun getItemCount(): Int  = recipe.size

}