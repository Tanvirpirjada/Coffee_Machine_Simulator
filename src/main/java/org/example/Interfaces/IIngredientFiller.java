package org.example.Interfaces;

import org.example.enums.IngredientType;

public interface IIngredientFiller {
    void fill(IngredientType ingredientType, Float quantity);
}
