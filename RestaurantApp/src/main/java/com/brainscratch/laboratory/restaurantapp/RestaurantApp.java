package com.brainscratch.laboratory.restaurantapp;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Welcome to Restaurant Manager");

            String answer;
            boolean yesNo;

            while (true) {
                System.out.println("Do you want to add new restaurant?");
                System.out.println("yes/no");
                answer = scanner.nextLine().trim().toLowerCase();
                if (answer.equals("yes")) {
                    yesNo = true;
                    new RegistrationDialogue(scanner).start(scanner);
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
