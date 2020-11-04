package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class RestaurantFileProcessor {
    public static RestaurantList getAll() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File json = Paths.get("./restaurants.json").toFile();
            if(!json.exists()) {
                json.createNewFile();
            }

            try {
                RestaurantList restaurants = mapper.readValue(json, RestaurantList.class);
                return restaurants;
            } catch (MismatchedInputException e) {
                return new RestaurantList();
            }
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public static void save(RestaurantList restaurants) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get("./restaurant.json").toFile(), restaurants);
        } catch (IOException e) {
            throw new IllegalStateException("Something went wrong during JSON updating", e);
        }
    }

    public static void add(Restaurant restaurant) {
        RestaurantList restaurants = getAll();

        restaurants.getRestaurants().add(restaurant);

        save(restaurants);
    }

    public static void update(Restaurant restaurant) {
        RestaurantList restaurants = getAll();

        List<Restaurant> data = restaurants.getRestaurants();
        for(int i = 0; i < data.size() - 1; i++ ) {
            if(restaurant.getId() == data.get(i).getId()) {
                data.remove(i);
                data.add(i, restaurant);

                break;
            }
        }

        save(restaurants);
    }

    public static void remove(Restaurant restaurant) {
        RestaurantList restaurants = getAll();

        List<Restaurant> data = restaurants.getRestaurants();
        for (int i = 0; i < data.size() - 1; i++) {
            if (restaurant.getId() == data.get(i).getId()) {
                data.remove(i);

                break;
            }
        }

        save(restaurants);
    }

    public static boolean checkCredentials(String login , String password) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        for (int i = 0; i < data.size() - 1; i++)
            if (login.equals(data.get(i).getNickName())  && password.equals(data.get(i).getPassword())) {
                return true;
            }
        return false;

    }

}
