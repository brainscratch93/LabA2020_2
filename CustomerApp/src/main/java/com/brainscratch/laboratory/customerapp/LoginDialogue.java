package com.brainscratch.laboratory.customerapp;
import java.util.Scanner;

public class LoginDialogue {

    public int login() {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(" Enter username => ");
            String username = scanner.nextLine();

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();

            int userID = CustomerFileProcessor.checkCredentials(username,password);

            if (userID != -1){
                System.out.print("Login Successful");
                return userID;
            } else {
                System.out.print("Login is not Successful ");
                System.out.print("try again or return back? (again/back)");
                String userChoice = scanner.nextLine();
                if(userChoice.equals("again")) {
                    return login();
                } else return -1;
            }
        }
    }
}