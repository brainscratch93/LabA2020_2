package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;
import java.io.*;

public class CustomerApp {
    public DataInputStream inputStream = null;
    public DataOutputStream outputStream = null;


    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setName();
        customer1.setLastName();
        customer1.setCity();
        customer1.setResidenceInitials();
        customer1.setEmail();
        customer1.setNickname();
        customer1.setPassword();\

        Customer customer2 = new Customer();
        customer2.setName();
        customer2.setLastName();
        customer2.setCity();
        customer2.setResidenceInitials();
        customer2.setEmail();
        customer2.setNickname();
        customer2.setPassword();


        CustomerFileProcessor processor = new CustomerFileProcessor();





        System.out.println(processor.getAll());// should show empty collection or if file is not empty - shoe content

        processor.add(customer1);
        System.out.println(processor.getAll());// should show full collection with your customer1

        processor.add(customer2);
        System.out.println(processor.getAll());// should show full collection with your customer1 and customer 2

        processor.remove(customer1);
        System.out.println(processor.getAll());// should show full collection with your  customer 2
        customer2.setName("new name");
        processor.update(customer2);
        System.out.println(processor.getAll());// should show full collection with your  customer 2 and name must be new.
    }
}
