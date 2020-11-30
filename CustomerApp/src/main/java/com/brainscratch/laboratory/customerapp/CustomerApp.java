package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.restaurantapp.Login;
import com.brainscratch.laboratory.restaurantapp.RestaurantFileProcessor;

import java.io.IOException;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) throws IOException {

        CustomerFileProcessor processor = new CustomerFileProcessor();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Welcome to Customer App, type one of the following numbers to proceed : ");
            System.out.println("1- Sign Up");
            System.out.println("2- Sign In");
            System.out.println("3- Search restaurant by Municipality");
            System.out.println("4- Search restaurant by Name");
            System.out.println("5- Search restaurant by Type");
            System.out.println("6- Search restaurant by Municipality & Type");
            System.out.println("7- Search restaurant by ID");

            int choice = scanner.nextInt();
            if (choice == 1) {
                new Registration().start();
            } else if (choice == 2) {
                new LoginDialogue().login();
            } else if (choice == 3) {
                RestaurantFileProcessor.searchByMunicipality();
            } else if (choice == 4) {
                RestaurantFileProcessor.searchByName()
            } else if (choice == 5) {
                RestaurantFileProcessor.searchByType();
            } else if (choice == 6) {
                RestaurantFileProcessor.searchByMunicipalityAndType();
            } else if (choice == 7) {
                RestaurantFileProcessor.searchById();
            }
        }
    }
}
