// Write your code here

package com.example.recipe;

import java.util.List;

public class Recipe {
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public int getRecipeId() {
        return this.recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeType() {
        return this.recipeType;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe(int recipeId, String recipeName, String recipeType, List<String> ingredients) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }

}
// recipeId int An integer that represents the unique ID of the recipe
// recipeName String A string that represents the name of the recipe
// recipeType String A string that represents the type(veg or non-veg) of the
// recipe
// ingredients List A list of strings that represent the ingredients of the
// recipe.