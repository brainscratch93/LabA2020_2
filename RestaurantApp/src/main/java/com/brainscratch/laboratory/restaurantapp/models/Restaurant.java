package com.brainscratch.laboratory.restaurantapp.models;

public class Restaurant {

    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private String website;
    private String type;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public  Restaurant setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Restaurant setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Restaurant setphoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public Restaurant setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getType() {
        return type;
    }

    public Restaurant setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", website=" + website +
                ", type=" + type +
                "id=" + id +'\'' +
                '}';
    }
}

