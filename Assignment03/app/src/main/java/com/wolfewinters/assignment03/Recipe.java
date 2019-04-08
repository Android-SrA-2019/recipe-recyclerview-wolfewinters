package com.wolfewinters.assignment03;
import java.io.Serializable;
public class Recipe implements Serializable {
    public String name;
    public String description;
    public String image;
    public String ingredients;
    public String directions;
    public Recipe(String name, String description, String image, String ingredients, String directions) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
        this.directions = directions;
    }
}