package com.brainscratch.laboratory.restaurantapp;

import com.brainscratch.laboratory.restaurantapp.models.Restaurant;

public class Pojo {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();

        r1.setName("The Crib");
        r1.setAddress("Urcol Street 32");
        r1.setPhoneNumber("02 9876565");
        r1.setWebsite("thecribrestaurant.com");
        r1.setType("steak house");

        System.out.println("Name : " + r1.getName());
        System.out.println("Address : " + r1.getAddress());
        System.out.println("Phone Number : " + r1.getPhoneNumber());
        System.out.println("Website : " + r1.getWebsite());
        System.out.println("Type : " + r1.getType());

    }
}