package com.brainscratch.laboratory.restaurantapp;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {

        RestaurantFileProcessor processor = new RestaurantFileProcessor();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Welcome to Restaurant Manager, do you want to add a new restaurant? ");

            String answer;
            boolean yesNo;

            System.out.println("yes/no");
            while (true) {
                answer = scanner.nextLine().trim().toLowerCase();
                if (answer.equals("yes")) {
                    yesNo = true;
                    new RegistrationDialogue().start();
                } else if (answer.equals("no")) {
                    yesNo = false;
                    System.out.println("goodbye");
                    break;
                } else {
                    System.out.println("you input incorrect value");
                }
            }


        }
    }
}