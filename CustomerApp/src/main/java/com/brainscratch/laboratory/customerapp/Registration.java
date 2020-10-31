package com.brainscratch.laboratory.customerapp;

import com.brainscratch.laboratory.customerapp.models.Customer;

import java.util.Scanner;

public class Registration {

    static Register register = new Register();


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter name => ");
            String name = scanner.nextLine();
            register.setName(name);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter city => ");
            String city = scanner.nextLine();
            register.setCity(city);

            System.out.print(" Enter residence initials => ");
            String residenceInitials = scanner.nextLine();
            register.setResidenceInitials(residenceInitials);

            System.out.print(" Enter email => ");
            String email = scanner.nextLine();
            register.setEmail(email);

            System.out.print(" Enter nickname => ");
            String nickName = scanner.nextLine();
            register.setNickName(nickName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter Id => ");
            String personalId = scanner.nextLine();
            register.setPersonalId(personalId);

            System.out.println(register.toString());
        }
    }
}

class Register {

    private String name;
    private String lastName;
    private String city;
    private String residenceInitials;
    private String email;
    private String nickname;
    private String password;
    private String personalId;



    public String getPersonalId() {
        return personalId;
    }

    public Customer setPersonalId(String personalId) {
        this.personalId = personalId;

    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public String setCity(String city) {
        this.city = city;
        return city;
    }

    public String getResidenceInitials() {
        return residenceInitials;
    }

    public Customer setResidenceInitials(String residenceInitials) {
        this.residenceInitials = residenceInitials;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public Customer setNickName(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + personalId +
                ", name='" + name + '\'' +
                ", surname='" + lastName + '\'' +
                ", city=" + city +
                ", residenceInitials=" + residenceInitials +
                ", email=" + email +
                ", nickname=" + nickname +
                ", password=" + password + '\'' +
                '}';
    }
}