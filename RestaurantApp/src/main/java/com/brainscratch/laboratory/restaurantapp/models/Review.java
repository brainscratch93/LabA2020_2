package com.brainscratch.laboratory.restaurantapp.models;

public class Review {
    int rating;
    String comment;
    String author;

    public Review(Review review) {
    }

    public Review() {

    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
