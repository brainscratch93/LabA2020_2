package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantList {
    private List<Restaurant> restaurants = new ArrayList<>();

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public RestaurantList setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
        return this;
    }

    @Override
    public String toString() {
        return "RestaurantList{" +
                "restaurants=" + restaurants +
                '}';
    }
}