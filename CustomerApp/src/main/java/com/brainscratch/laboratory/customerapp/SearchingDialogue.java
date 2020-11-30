package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.restaurantapp.RestaurantFileProcessor;
import com.brainscratch.laboratory.restaurantapp.models.Restaurant;
import com.brainscratch.laboratory.restaurantapp.models.Review;

import java.util.List;
import java.util.Scanner;

public class SearchingDialogue {

    public SearchingDialogue(int userID) {
        if ((userID != -1)) {
            this.isUserLogin = true;
            this.userID = userID;
        }
    }

    private boolean isUserLogin = false;
    private int userID;

    public void searchByName() {
        System.out.println("Enter restaurant name");
        Scanner scanner = new Scanner(System.in);
        String restaurantName = scanner.nextLine();
        List<Restaurant> restaurants = RestaurantFileProcessor.searchByName(restaurantName);

        if (restaurants.isEmpty()) {
            System.out.println("no restaurants found");
            System.out.println("what would you do? try again or back");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("again")) {
                searchByName();
            } else return;
        }
        for (Restaurant restaurant : restaurants) {
            RestaurantFileProcessor.viewRestaurantInfo(restaurant);
        }

        System.out.println("what do you want to do? back or judge");
        String userChoice = scanner.nextLine();
        if (userChoice.equals("again")) {
            searchByName();
        } else if (userChoice.equals("judge")) {
            if (isUserLogin) {
                System.out.println("enter restaurant ID");
                String restaurantID = scanner.nextLine();
                Restaurant restaurant = RestaurantFileProcessor.searchById(restaurantID);
                Review review = CustomerFileProcessor.judge(userID);
                restaurant.getReviews().add(review);
                RestaurantFileProcessor.update(restaurant);
            } else {
                System.out.println("not logged in");
            }

        }
    }

    public void searchByID() {
        System.out.println("Enter restaurant ID");
        Scanner scanner = new Scanner(System.in);
        String restaurantID = scanner.nextLine();
        List<Restaurant> restaurants = (List<Restaurant>) RestaurantFileProcessor.searchById(restaurantID);

        if (restaurants.isEmpty()) {
            System.out.println("no restaurants found");
            System.out.println("what would you do? try again or back");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("again")) {
                searchByID();
            } else return;
        }
        for (Restaurant restaurant : restaurants) {
            RestaurantFileProcessor.viewRestaurantInfo(restaurant);
        }

        System.out.println("what do you want to do? back or judge");
        String userChoice = scanner.nextLine();
        if (userChoice.equals("again")) {
            searchByID();
        } else if (userChoice.equals("judge")) {
            if (isUserLogin) {
                Restaurant restaurant = RestaurantFileProcessor.searchById(restaurantID);
                Review review = CustomerFileProcessor.judge(userID);
                restaurant.getReviews().add(review);
                RestaurantFileProcessor.update(restaurant);
            } else {
                System.out.println("not logged in");
            }
        }


    }

    public void searchByMunicipality() {
        System.out.println("Enter restaurant municipality");
        Scanner scanner = new Scanner(System.in);
        String restaurantMunicipality = scanner.nextLine();
        List<Restaurant> restaurants = RestaurantFileProcessor.searchByName(restaurantMunicipality);

        if (restaurants.isEmpty()) {
            System.out.println("no restaurants found");
            System.out.println("what would you do? try again or back");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("again")) {
                searchByMunicipality();
            } else return;
        }
        for (Restaurant restaurant : restaurants) {
            RestaurantFileProcessor.viewRestaurantInfo(restaurant);
        }

        System.out.println("what do you want to do? back or judge");
        String userChoice = scanner.nextLine();
        if (userChoice.equals("again")) {
            searchByMunicipality();
        } else if (userChoice.equals("judge")) {
            if (isUserLogin) {
                System.out.println("enter restaurant ID");
                String restaurantID = scanner.nextLine();
                Restaurant restaurant = RestaurantFileProcessor.searchById(restaurantID);
                Review review = CustomerFileProcessor.judge(userID);
                restaurant.getReviews().add(review);
                RestaurantFileProcessor.update(restaurant);
            } else {
                System.out.println("not logged in");
            }

        }
    }

    public void searchByType() {
        System.out.println("Enter restaurant Type");
        Scanner scanner = new Scanner(System.in);
        String restaurantType = scanner.nextLine();
        List<Restaurant> restaurants = RestaurantFileProcessor.searchByName(restaurantType);

        if (restaurants.isEmpty()) {
            System.out.println("no restaurants found");
            System.out.println("what would you do? try again or back");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("again")) {
                searchByType();
            } else return;
        }
        for (Restaurant restaurant : restaurants) {
            RestaurantFileProcessor.viewRestaurantInfo(restaurant);
        }

        System.out.println("what do you want to do? back or judge");
        String userChoice = scanner.nextLine();
        if (userChoice.equals("again")) {
            searchByType();
        } else if (userChoice.equals("judge")) {
            if (isUserLogin) {
                System.out.println("enter restaurant ID");
                String restaurantID = scanner.nextLine();
                Restaurant restaurant = RestaurantFileProcessor.searchById(restaurantID);
                Review review = CustomerFileProcessor.judge(userID);
                restaurant.getReviews().add(review);
                RestaurantFileProcessor.update(restaurant);
            } else {
                System.out.println("not logged in");
            }

        }
    }

    public void searchByMunicipalityAndType() {
        System.out.println("Enter restaurant municipality");
        Scanner scanner = new Scanner(System.in);
        String restaurantMunicipality = scanner.nextLine();
        List<Restaurant> restaurants = RestaurantFileProcessor.searchByName(restaurantMunicipality);

        if (restaurants.isEmpty()) {
            System.out.println("no restaurants found");
            System.out.println("what would you do? try again or back");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("again")) {
                searchByMunicipality();
            } else return;
        }
        for (Restaurant restaurant : restaurants) {
            RestaurantFileProcessor.viewRestaurantInfo(restaurant);
        }
        searchByType();
    }
}

