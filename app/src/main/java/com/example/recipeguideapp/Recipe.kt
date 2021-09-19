package com.example.recipeguideapp

var recipeList = mutableListOf<Recipe>()
var RECIPE_ID_EXTRA = "recipeExtra"

class Recipe (
    var cover :Int,
    var name: String,
    var ingredients : String,
    var method : String,
    var id: Int? = recipeList.size
)