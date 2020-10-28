package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;
import java.io.IOException;
import java.util.Arrays;

public class CustomerApp {

    public static void main(String[] args) throws IOException {

        Customer customer1 = new Customer();
        customer1.setName("Manuel");
        customer1.setLastName("Martorana");
        customer1.setCity("Rescaldina");
        customer1.setResidenceInitials("MI");
        customer1.setEmail("illoallo@aol.com");
        customer1.setActive(true);
        customer1.setNickname("illoallo");
        customer1.setPassword("allo93");
        customer1.setPersonalId(1);
        customer1.setData((String[]) Arrays.asList("test 1", "test 2").toArray());

        Customer customer2 = new Customer();
        customer2.setName("Matteo");
        customer2.setLastName("Martorana");
        customer2.setCity("Legnano");
        customer2.setResidenceInitials("MI");
        customer2.setEmail("matteom@outlook.com");
        customer2.setActive(true);
        customer2.setNickname("ita.mattix");
        customer2.setPassword("125677");
        customer2.setPersonalId(2);
        customer2.setData((String[])Arrays.asList("developer 1", "qa 2").toArray());


        CustomerFileProcessor processor = new CustomerFileProcessor();


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
