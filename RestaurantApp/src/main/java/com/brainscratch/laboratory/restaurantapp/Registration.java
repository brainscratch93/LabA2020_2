package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.util.Scanner;

public class Registration {

    static Restaurant restaurant = new Restaurant();


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter nickname => ");
            String nickName = scanner.nextLine();
            restaurant.setNickName(nickName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            restaurant.setPassword(password);

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