package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;

import java.util.Scanner;

public class Registration {

    public  void start() {

     Customer customer = new Customer();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter name => ");
            String name = scanner.nextLine();
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

            System.out.print(" Enter nickname => ");
            String nickName = scanner.nextLine();
            customer.setNickname(nickName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            customer.setPassword(password);

            System.out.print(" Enter Id => ");
            int personalId = scanner.nextInt();
            customer.setId(personalId);

            CustomerFileProcessor.add(customer);
        }
    }
}