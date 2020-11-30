package com.brainscratch.laboratory.restaurantapp;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter username => ");
            String username = scanner.nextLine();

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();

            if (RestaurantFileProcessor.checkCredentials(username,password)){
                System.out.print("Login Successful");
            } else {
                System.out.print("Login is not Successful ");
            }
        }
    }
}