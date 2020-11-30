package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.util.Scanner;

public class RegistrationDialogue {



    public void start() {

        Restaurant restaurant = new Restaurant();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter name => ");
            String name = scanner.nextLine();
            restaurant.setName(name);


            System.out.print(" Enter address => ");
            String address = scanner.nextLine();
            restaurant.setAddress(address);

            System.out.print(" Enter phone number => ");
            int phoneNumber = scanner.nextInt();
            restaurant.setphoneNumber(phoneNumber);

            System.out.print(" Enter website => ");
            String website = scanner.nextLine();
            restaurant.setWebsite(website);


            System.out.print(" Enter type => ");
            String type = scanner.nextLine();
            restaurant.setType(type);

            RestaurantFileProcessor.add(restaurant);
        }
    }
}