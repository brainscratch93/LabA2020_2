package com.brainscratch.laboratory.customerapp;

import java.io.IOException;
import java.util.Scanner;

public class CustomerApp {


    public static void main(String[] args) throws IOException {

        CustomerFileProcessor processor = new CustomerFileProcessor();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(" Welcome to Customer App, type one of the following numbers to proceed : ");
            int userID = -1;
            int choice = 0;
            while (choice != 8) {
                System.out.println("1- Sign Up");
                System.out.println("2- Sign In");
                System.out.println("3- Search restaurant by Municipality");
                System.out.println("4- Search restaurant by Name");
                System.out.println("5- Search restaurant by Type");
                System.out.println("6- Search restaurant by Municipality & Type");
                System.out.println("7- Search restaurant by ID");
                System.out.println("8- Exit");

                choice = scanner.nextInt();
                if (choice == 1) {
                    new Registration(scanner).start();
                } else if (choice == 2) {
                   userID = new LoginDialogue(scanner).login();
                } else if (choice == 3) {
                    new SearchingDialogue(scanner,userID).searchByMunicipality();
                } else if (choice == 4) {
                    new SearchingDialogue(scanner,userID).searchByName();
                } else if (choice == 5) {
                    new SearchingDialogue(scanner,userID).searchByType();
                } else if (choice == 6) {
                    new SearchingDialogue(scanner,userID).searchByMunicipalityAndType();
                } else if (choice == 7) {
                    new SearchingDialogue(scanner,userID).searchByID();
                } else if (choice < 1 | choice > 8) {
                    System.out.println("Invalid Value, try write a number between 1 and 7");
                } else if(choice == 8) {
                    System.out.println("Goodbye");
                }
            }
        }
    }
}
