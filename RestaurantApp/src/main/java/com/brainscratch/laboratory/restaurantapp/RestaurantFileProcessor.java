package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;
import com.brainscratch.laboratory.restaurantapp.models.Review;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RestaurantFileProcessor {
    public static RestaurantList getAll() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File json = Paths.get("./restaurants.json").toFile();
            if (!json.exists()) {
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
        for (int i = 0; i < data.size() - 1; i++) {
            if (restaurant.getId() == data.get(i).getId()) {
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

    public static List<Restaurant> searchByMunicipality(String municipalityName) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i).getAddress().contains(municipalityName)) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> searchByType(Restaurant restaurant) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() - 1; i++) {
            if (restaurant.getType() == data.get(i).getType()) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> searchByName(Restaurant restaurant) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() - 1; i++) {
            if (restaurant.getName() == data.get(i).getName()) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> searchById(Restaurant restaurant) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() - 1; i++) {
            if (restaurant.getId() == data.get(i).getId()) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> searchByMunicipalityAndType(String municipalityName, Restaurant restaurant) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i).getAddress().contains(municipalityName) & restaurant.getType() == data.get(i).getType()) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> selectRestaurant(Restaurant restaurant, String municipalityName) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (restaurant.getName() == data.get(i).getName() | data.get(i).getAddress().contains(municipalityName) & restaurant.getType() == data.get(i).getType())
                System.out.println((i + 1) + " - " + list.get(i).getName());
        }

        return list;
    }

    public static List<Restaurant> getRestaurantInfo(Restaurant restaurant) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> list = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {

            restaurant.getId();
            restaurant.getName();
        }

        return list;

    }

    public static void viewRestaurantInfo(Restaurant restaurant) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> list = new ArrayList<>();
        String star = "***********";

        for (int i = 0; i < list.size(); i++) {

            System.out.println(star);
            System.out.println("*" + getRestaurantInfo(restaurant) + "*");
            System.out.println(star);

        }

    }

    public static void saveReview(Restaurant restaurant, Review review) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() - 1; i++) {
            if (restaurant.getId() == data.get(i).getId()) {
                result.add(data.get(i));

                break;
            }

            restaurant.getReviews().add(review);

        }

        save(restaurants);

    }

}
