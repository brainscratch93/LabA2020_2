package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public CustomerList setCustomers(List<Customer> customers) {
        this.customers = customers;
        return this;
    }

    @Override
    public String toString() {
        return "CustomerList{" +
                "customers=" + customers +
                '}';
    }
}
