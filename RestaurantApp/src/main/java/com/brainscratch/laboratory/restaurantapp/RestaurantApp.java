package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.util.Arrays;

public class RestaurantApp {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();

        r1.setName("The Crib");
        r1.setAddress("Urcol Street 32");
        r1.setphoneNumber(02445677);
        r1.setWebsite("thecribrestaurant.com");
        r1.setType("steak house");
        r1.setData((String[]) Arrays.asList("test 1").toArray());

        RestaurantFileProcessor processor = new RestaurantFileProcessor();


        System.out.println(RestaurantFileProcessor.getAll());// should show empty collection or if file is not empty - shoe content

        RestaurantFileProcessor.add(r1);
        System.out.println(RestaurantFileProcessor.getAll());// should show full collection with your restaurant

        RestaurantFileProcessor.update(r1);
        System.out.println(RestaurantFileProcessor.getAll());// should show full collection with your restaurants
    }
}
