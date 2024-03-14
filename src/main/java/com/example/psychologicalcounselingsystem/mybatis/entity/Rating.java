package com.example.psychologicalcounselingsystem.mybatis.entity;

import java.time.LocalDateTime;

public class Rating {
    private int ratingID;
    private Integer userID;
    private Integer counselorID;
    private Integer appointmentID;
    private String rating;
    private String comment;
    private LocalDateTime timestamp;


    public Rating() {
    }

    public Rating(Integer userID, Integer counselorID, Integer appointmentID, String rating, String comment) {
        this.userID = userID;
        this.counselorID = counselorID;
        this.appointmentID = appointmentID;
        this.rating = rating;
        this.comment = comment;
    }

    public Rating(int ratingID, Integer userID, Integer counselorID, Integer appointmentID, String rating, String comment, LocalDateTime timestamp) {
        this.ratingID = ratingID;
        this.userID = userID;
        this.counselorID = counselorID;
        this.appointmentID = appointmentID;
        this.rating = rating;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    public int getRatingID() {
        return ratingID;
    }

    public void setRatingID(int ratingID) {
        this.ratingID = ratingID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getCounselorID() {
        return counselorID;
    }

    public void setCounselorID(Integer counselorID) {
        this.counselorID = counselorID;
    }

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
