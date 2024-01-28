// Write your code here

package com.example.recipe;

import java.util.ArrayList;

public interface RecipeRepository {

    ArrayList<Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(int recipeId);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);

}