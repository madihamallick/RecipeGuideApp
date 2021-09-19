package com.example.recipeguideapp

import android.widget.ExpandableListView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeguideapp.databinding.CardViewRecipeBinding

class cardviewholder(
    private val cardViewRecipeBinding: CardViewRecipeBinding,
    private val clickListener: Recipeclicklistener

    ) :RecyclerView.ViewHolder(cardViewRecipeBinding.root)
{

        fun bindrecipe(recipe: Recipe){
            cardViewRecipeBinding.cover.setImageResource(recipe.cover)
            cardViewRecipeBinding.title.text = recipe.name
            cardViewRecipeBinding.method.text = recipe.method

            cardViewRecipeBinding.cardView.setOnClickListener{
                clickListener.onClick(recipe)
            }
        }
}