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
            File json = Paths.get("./EatAdvisor.Dati").toFile();
            if (!json.exists()) {
                json.createNewFile();
            }

            try {
                RestaurantList restaurants = mapper.readValue(json, RestaurantList.class);
                return restaurants;
            } catch (MismatchedInputException e) {
                System.err.println(e);
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
            File json = Paths.get("./EatAdvisor.Dati").toFile();
            if (!json.exists()) {
                json.createNewFile();
            }
            mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get("./EatAdvisor.Dati").toFile(), restaurants);
        } catch (IOException e) {
            System.err.println(e);
            throw new IllegalStateException("Something went wrong during JSON updating", e);
        }
    }

    public static void add(Restaurant restaurant) {

        RestaurantList restaurants = getAll();
        int maxId = 0;
        for (Restaurant restaurant1 : restaurants.getRestaurants()) {
            if (restaurant1.getId() > maxId) {
                maxId = restaurant1.getId();
            }
        }
        restaurant.setId(maxId + 1);
        restaurants.getRestaurants().add(restaurant);

        save(restaurants);
    }

    public static void update(Restaurant restaurant) {
        RestaurantList restaurants = getAll();

        List<Restaurant> data = restaurants.getRestaurants();
        for (int i = 0; i < data.size() ; i++) {
            if (restaurant.getId() == data.get(i).getId()) {
                data.remove(i);
                data.add(i, restaurant);

                break;
            }
        }

        save(restaurants);
    }

    public static List<Restaurant> searchByMunicipality(String municipalityName) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() ; i++) {
            if (data.get(i).getAddress().contains(municipalityName)) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> searchByType(String restaurantType) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if (restaurantType.equals(data.get(i).getType())) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static List<Restaurant> searchByName(String name) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size() ; i++) {
            if (name.equals(data.get(i).getName())) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public static Restaurant searchById(int restaurantID) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();

        for (int i = 0; i < data.size(); i++) {
            if ((data.get(i).getId()) == restaurantID) {
                return data.get(i);
            }
        }
            return null;
    }

    public static List<Restaurant> searchByMunicipalityAndType(String municipalityName, String restaurantType) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getAddress().contains(municipalityName) & restaurantType.equals(data.get(i).getType())) {
                result.add(data.get(i));
            }
        }

            return result;
    }

    public static void viewRestaurantInfo(Restaurant restaurant) {
        String star = "***********";
        String plus = "+++++++++++";

            System.out.println(star);
            System.out.println("* id : " + restaurant.getId() + "*");
            System.out.println("* name : " + restaurant.getName() + "*");
            System.out.println("* address : " + restaurant.getAddress() + "*");
            System.out.println("* phone number : " + restaurant.getPhoneNumber() + "*");
            System.out.println("* website : " + restaurant.getWebsite() + "*");
            System.out.println("* type : " + restaurant.getType() + "*");
            System.out.println("* reviews : ");
            if(restaurant.getReviews() == null || restaurant.getReviews().isEmpty()) {
                System.out.println("*** there are no reviews ***");
            } else {
                for(Review review : restaurant.getReviews()) {
                    System.out.println(plus);
                    System.out.println("*** rating: " + review.getRating() + " ***");
                    System.out.println("*** comment: " + review.getComment() + " ***");
                    System.out.println("*** author: " + review.getAuthor() + " ***");
                    System.out.println(plus);
                }
            }
            System.out.println(star);

        }


    public static void saveReview(Restaurant restaurant, Review review) {
        RestaurantList restaurants = getAll();
        List<Restaurant> data = restaurants.getRestaurants();
        List<Restaurant> result = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if (restaurant.getId() == data.get(i).getId()) {
                result.add(data.get(i));

                break;
            }

            restaurant.getReviews().add(review);

        }

        save(restaurants);

    }

}
