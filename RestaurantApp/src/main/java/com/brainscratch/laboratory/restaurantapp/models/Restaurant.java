package com.brainscratch.laboratory.restaurantapp.models;

import java.util.*;

public class Restaurant {

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String website;
    private String type;

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    private ArrayList<Review> reviews = new ArrayList<Review>() {


        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Review> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Review review) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Review> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Review> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Review get(int index) {
            return null;
        }

        @Override
        public Review set(int index, Review element) {
            return null;
        }

        @Override
        public void add(int index, Review element) {

        }

        @Override
        public Review remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Review> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Review> listIterator(int index) {
            return null;
        }

        @Override
        public List<Review> subList(int fromIndex, int toIndex) {
            return null;
        }
    };



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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Restaurant setphoneNumber(String phoneNumber) {
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

