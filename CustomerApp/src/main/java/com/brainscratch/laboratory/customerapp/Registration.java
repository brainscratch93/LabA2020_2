package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;

import java.util.Scanner;

public class Registration {


    Scanner scanner;
    public Registration(Scanner scanner) {
        this.scanner = scanner;
    }

    public  void start() {

     Customer customer = new Customer();

            System.out.print(" Enter name => ");
            String name = scanner.nextLine();
            name = scanner.nextLine();
            customer.setName(name);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            customer.setLastName(lastName);

            System.out.print(" Enter city => ");
            String city = scanner.nextLine();
            customer.setCity(city);

            System.out.print(" Enter residence initials => ");
            String residenceInitials = scanner.nextLine();
            customer.setResidenceInitials(residenceInitials);

            System.out.print(" Enter email => ");
            String email = scanner.nextLine();
            customer.setEmail(email);


            System.out.print(" Enter username => ");
            String username = scanner.nextLine();
        boolean usernameCheck = CustomerFileProcessor.checkUsername(username);

        while (usernameCheck){
                System.out.println("Username already taken, try again");
                System.out.print(" Enter username => ");
                username = scanner.nextLine();
                usernameCheck = CustomerFileProcessor.checkUsername(username);

            }
            customer.setNickname(username);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            customer.setPassword(password);

            System.out.print(" Enter Id => ");
            int personalId = scanner.nextInt();
            customer.setId(personalId);

            System.out.println("Registration Completed");
            CustomerFileProcessor.add(customer);
        }
    }