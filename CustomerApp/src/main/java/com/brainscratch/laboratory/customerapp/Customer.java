package com.brainscratch.laboratory.customerapp;

public class Customer {

    private String name;
    private String lastName;
    private String city;
    private String residenceInitials;
    private String email;
    private String nickname;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getResidenceInitials() {
        return residenceInitials;
    }

    public void setResidenceInitials(String residenceInitials) {
        this.residenceInitials = residenceInitials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}