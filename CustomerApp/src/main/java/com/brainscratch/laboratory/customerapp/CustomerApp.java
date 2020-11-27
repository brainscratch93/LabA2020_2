package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;
import com.brainscratch.laboratory.restaurantapp.RestaurantApp;
import com.brainscratch.laboratory.restaurantapp.RestaurantFileProcessor;
import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

import java.io.IOException;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) throws IOException {

        Customer customer1 = new Customer();
        customer1.setName("Manuel");
        customer1.setLastName("Martorana");
        customer1.setCity("Rescaldina");
        customer1.setResidenceInitials("MI");
        customer1.setEmail("illoallo@aol.com");
        customer1.setNickname("illoallo");
        customer1.setPassword("allo93");
        customer1.setId(1);

        Customer customer2 = new Customer();
        customer2.setName("Matteo");
        customer2.setLastName("Martorana");
        customer2.setCity("Legnano");
        customer2.setResidenceInitials("MI");
        customer2.setEmail("matteom@outlook.com");
        customer2.setNickname("ita.mattix");
        customer2.setPassword("125677");
        customer2.setId(2);


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
                Registration.main(Customer customer1);
            } else if (choice == 2) {
                Login.main();
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


        System.out.println(CustomerFileProcessor.getAll());// should show empty collection or if file is not empty - shoe content

        CustomerFileProcessor.add(customer1);
        System.out.println(CustomerFileProcessor.getAll());// should show full collection with your customer1

        CustomerFileProcessor.add(customer2);
        System.out.println(CustomerFileProcessor.getAll());// should show full collection with your customer1 and customer 2

        CustomerFileProcessor.remove(customer1);
        System.out.println(CustomerFileProcessor.getAll());// should show full collection with your  customer 2
        customer2.setName("new name");
        CustomerFileProcessor.update(customer2);
        System.out.println(CustomerFileProcessor.getAll());// should show full collection with your  customer 2 and name must be new.
    }
}
