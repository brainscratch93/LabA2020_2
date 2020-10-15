package com.brainscratch.laboratory.restaurantapp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Json {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Restaurant restaurant = createRestaurant();

        try {

            // Java objects to JSON file
            mapper.writeValue(new File("c:\\test\\restaurant.json"), restaurant);

            // Java objects to JSON string - compact-print
            String jsonString = mapper.writeValueAsString(restaurant);

            System.out.println(jsonString);
            // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(restaurant);
            System.out.println(jsonInString2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Restaurant createRestaurant() {
        Restaurant restaurant = new Restaurant();

        restaurant.setName("The Crib");
        restaurant.setAddress("Urgot 22");
        restaurant.setPhoneNumber("02 456789");
        restaurant.setWebsite("thecrib.com");
        restaurant.setType("steakhouse");

        return restaurant;


    }
}
