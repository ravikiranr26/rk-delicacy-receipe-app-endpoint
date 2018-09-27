package com.rkdelicacy.demo.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

public class Recipes {
    @Id
    private String id;
    private String name;
    private Date date;
    private String image;
    private String instructions;
    private ArrayList<String> ingredients;
    private int dishes;
    private Boolean isVeg;
    private String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList ingredients) {
        this.ingredients = ingredients;
    }

    public int getDishes() {
        return dishes;
    }

    public void setDishes(int dishes) {
        this.dishes = dishes;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        this.isVeg = veg;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Recipes{"+
                "id='"+ id + '\'' +
                "date='"+ date + '\'' +
                "name='"+ name + '\'' +
                "country='"+ country + '\'' +
                "dishnum='"+ dishes + '\'' +
                "pic='"+ image + '\'' +
                "instruction='"+ instructions + '\'' +
                "ingredients='"+ ingredients + '\'' +
                ", isVeg=" + isVeg +
                ')';
    }
}
