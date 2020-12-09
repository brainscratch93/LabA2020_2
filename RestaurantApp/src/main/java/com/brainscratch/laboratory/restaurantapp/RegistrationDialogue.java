package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.util.Scanner;

public class RegistrationDialogue {

    Scanner scanner;
    public RegistrationDialogue(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start(Scanner scanner) {

        Restaurant restaurant = new Restaurant();

        try {
                System.out.print(" Enter name => ");
                String name = scanner.nextLine();
                restaurant.setName(name);


                System.out.print(" Enter address => ");
                String address = scanner.nextLine();
                restaurant.setAddress(address);


                System.out.print(" Enter phone number => ");
                String phoneNumber = scanner.nextLine();
                restaurant.setphoneNumber(phoneNumber);


                System.out.print(" Enter website => ");
                String website = scanner.nextLine();
                restaurant.setWebsite(website);



                System.out.print(" Enter type => ");
                String type = scanner.nextLine();
                restaurant.setType(type);


                RestaurantFileProcessor.add(restaurant);
                System.out.println("added to the restaurant");

        } catch (IllegalStateException e) {
            System.out.println("Exception is: " + e);
        }
    }
}