package com.brainscratch.laboratory.customerapp;


import com.brainscratch.laboratory.customerapp.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class Review {
    int rating;
    String comment;
    String author;
    int authorId;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
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





    public String authorName (Customer customer) {
           author = customer.getNickname();

        }

    }
