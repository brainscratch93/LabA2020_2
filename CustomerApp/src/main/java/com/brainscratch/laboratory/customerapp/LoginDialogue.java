package com.brainscratch.laboratory.customerapp;
import java.util.Scanner;

public class LoginDialogue {

    Scanner scanner;
    public LoginDialogue(Scanner scanner) {
        this.scanner = scanner;
    }
    public int login() {


        System.out.println("Username:");
        String username = scanner.nextLine();
        username = scanner.nextLine();


        System.out.println("Password:");
        String password = scanner.nextLine();

            int userID = CustomerFileProcessor.checkCredentials(username,password);

            if (userID != -1){
                System.out.print("Login Successful");
                return userID;
            } else {
                System.out.print("Login is not Successful ");
                System.out.print("Try again or return back? (again/back)");
                String userChoice = scanner.nextLine();
                if(userChoice.equals("again")) {
                    return login();
                } else return -1;
            }
        }
    }