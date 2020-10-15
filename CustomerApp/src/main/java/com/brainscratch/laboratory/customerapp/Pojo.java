package com.brainscratch.laboratory.customerapp;

public class Pojo {
    public static void main(String[] args) {
        Customer c1 = new Customer();
         c1.setName("Chris");
         c1.setLastName("Derio");
         c1.setCity("Milan");
         c1.setResidenceInitials("MI");
         c1.setEmail("chrisdd@gmail.com");
         c1.setNickname("chis89de");
         c1.setPassword(".,.,");

        System.out.println("Name : " + c1.getName());
        System.out.println("Last Name : " + c1.getLastName());
        System.out.println("City : " + c1.getCity());
        System.out.println("Residence Initials : " + c1.getResidenceInitials());
        System.out.println("email : " + c1.getEmail());
        System.out.println("nickname : " + c1.getNickname());
        System.out.println("password : " + c1.getPassword());


    }

}