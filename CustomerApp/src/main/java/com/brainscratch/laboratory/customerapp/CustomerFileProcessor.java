package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CustomerFileProcessor {
        ObjectMapper mapper = new ObjectMapper();

        Customer customer = createCustomer();

        try {

            // Java objects to JSON file
            mapper.writeValue(new File("c:\\test\\customer.json"), customer);

            // Java objects to JSON string - compact-print
            String jsonString = mapper.writeValueAsString(customer);

            System.out.println(jsonString);
            // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);
            System.out.println(jsonInString2);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    private static Customer createCustomer() {
        Customer customer = new Customer();

        customer.setName("Alan");
        customer.setLastName("Brit");
        customer.setCity("Rescaldina");
        customer.setResidenceInitials("MI");
        customer.setEmail("illoallo@gmail.com");
        customer.setNickname("illoallo");
        customer.setPassword("...");

        return customer;
    }
}
}