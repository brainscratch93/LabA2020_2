package com.brainscratch.laboratory.customerapp.models;

public class Customer {

    private String name;
    private String lastName;
    private String city;
    private String residenceInitials;
    private String email;
    private String nickname;
    private String password;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }







    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
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
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public Customer setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
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