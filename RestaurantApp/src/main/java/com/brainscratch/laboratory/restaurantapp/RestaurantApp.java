package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();

        r1.setName("The Crib");
        r1.setAddress("Urcol Street 32");
        r1.setphoneNumber(02445677);
        r1.setWebsite("thecribrestaurant.com");
        r1.setType("steak house");
        r1.setId(34535);
        r1.setNickName("pier01");
        r1.setPassword("alcatraz");

        Restaurant r2 = new Restaurant();

        r2.setName("clubX");
        r2.setAddress("amolish Street 111");
        r2.setphoneNumber(022233456);
        r2.setWebsite("info@clux.com");
        r2.setType("risto-pub");
        r2.setId(38990);
        r2.setNickName("luke1997");
        r2.setPassword("clubX908!");

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
                    break;
                } else if (answer.equals("no")) {
                    yesNo = false;
                    break;
                } else {
                    break;
                }
            }

            if(yesNo == true) {
                Registration.main();
                // miss recieve data from user
                System.out.println("do you want to add another restaurant? ");
                System.out.println("yes/no");

                while (true) {
                    answer = scanner.nextLine().trim().toLowerCase();
                    if (answer.equals("yes")) {
                        yesNo = true;
                        break;
                    } else if (answer.equals("no")) {
                        yesNo = false;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
