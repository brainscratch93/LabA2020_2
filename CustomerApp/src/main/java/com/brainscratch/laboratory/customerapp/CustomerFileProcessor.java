package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class CustomerFileProcessor {

    public static CustomerList getAll() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File json = Paths.get("./customers.json").toFile();
            if (!json.exists()) {
                json.createNewFile();
            }

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
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get("./customers.json").toFile(), customers);
        } catch (IOException e) {
            throw new IllegalStateException("Something went wrong during JSON updating", e);
        }
    }

    public static void add(Customer customer) {
        CustomerList customers = getAll();

        customers.getCustomers().add(customer);

        save(customers);
    }

    public static void update(Customer customer) {
        CustomerList customers = getAll();

        List<Customer> data = customers.getCustomers();
        for (int i = 0; i < data.size() - 1; i++) {
            if (customer.getId() == data.get(i).getId()) {
                data.remove(i);
                data.add(i, customer);

                break;
            }
        }

        save(customers);
    }

    public static void remove(Customer customer) {
        CustomerList customers = getAll();

        List<Customer> data = customers.getCustomers();
        for (int i = 0; i < data.size() - 1; i++) {
            if (customer.getId() == data.get(i).getId()) {
                data.remove(i);

                break;
            }
        }

        save(customers);
    }

    public static boolean checkCredentials(String login , String password) {
        CustomerList customers = getAll();
        List<Customer> data = customers.getCustomers();
        for (int i = 0; i < data.size() - 1; i++)
            if (login.equals(data.get(i).getNickname())  && password.equals(data.get(i).getPassword())) {
                return true;
            }
        return false;

    }

}

