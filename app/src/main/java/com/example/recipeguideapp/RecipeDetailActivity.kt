package com.example.recipeguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipeguideapp.databinding.ActivityMainBinding
import com.example.recipeguideapp.databinding.ActivityRecipeDetailBinding

class RecipeDetailActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityRecipeDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recipeID = intent.getIntExtra(RECIPE_ID_EXTRA, -1)
        var recipe = recipeFromID(recipeID)
        if(recipe!=null){
            binding.cover.setImageResource(recipe.cover)
            binding.title.text = recipe.name
            binding.ingredients.text = recipe.ingredients
            binding.method.text = recipe.method
        }
    }

    private fun recipeFromID(recipeID: Int): Recipe? {
        for(recipe in recipeList){
            if(recipe.id == recipeID)
                return recipe
        }
        return null
    }
}