package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;
import com.brainscratch.laboratory.restaurantapp.models.Review;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CustomerFileProcessor {

    public static CustomerList getAll() {
        // from java object to json and back
        ObjectMapper mapper = new ObjectMapper();

        try {
            File json = Paths.get("./Users.json").toFile();
            if (!json.exists()) {
                json.createNewFile();
            }
        // from text to java object
            try {
                CustomerList customers = mapper.readValue(json, CustomerList.class);
                return customers;
            } catch (MismatchedInputException e) {
                return new CustomerList();
            }
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public static void save(CustomerList customers) {
        // from java object to json
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get("./Users.json").toFile(), customers);
        } catch (IOException e) {
            throw new IllegalStateException("Something went wrong during JSON updating", e);
        }
    }

    public static void add(Customer customer) {
        // read JSON file with all customers
        CustomerList customers = getAll();
        // get maxId
        int maxId = 0;
        for (Customer customer1 : customers.getCustomers()) {
            if (customer1.getId() > maxId) {
                maxId = customer1.getId();
            }
        }
        // add new customer to the list
        customer.setId(maxId + 1);

        customers.getCustomers().add(customer);
        //save updated list to json
        save(customers);
    }

    public static String checkCredentials(String login, String password) {
        CustomerList customers = getAll();
        List<Customer> data = customers.getCustomers();
        for (int i = 0; i < data.size(); i++)
            if (login.equals(data.get(i).getNickname()) && password.equals(data.get(i).getPassword())) {
                return data.get(i).getName() + " " + data.get(i).getLastName();
            }
        return null;

    }


    public static Review judge(String authorId) {

        String star = "***********";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value from 1 to 5");
        int number = scanner.nextInt();

        System.out.println(star);
        System.out.println("your rate is : " + number);

        System.out.println("write a review");
        String comment = scanner.nextLine();
        comment = scanner.nextLine();
        char maxLength = 256;

        if (comment.length() > maxLength) {
            comment = comment.substring(0, maxLength);
        }

        Review review = new Review();
        review.setRating(number);
        review.setComment(comment);
        review.setAuthor(authorId);

        System.out.println(star);
        return review;

    }


    public static boolean checkUsername(String username) {
        boolean userCheck= false;
        CustomerList customers = getAll();
        List<Customer> data = customers.getCustomers();
        for (int i = 0; i < data.size() - 1; i++)
            if (username.equals(data.get(i).getNickname())) {
                 userCheck = true;
            }
        return userCheck;

    }
}



