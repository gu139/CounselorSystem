package com.example.psychologicalcounselingsystem.mybatis.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private int id;

    private int userID;

    private String userName;

    private String userPhonenum;

    private String userProfect;

    private String userLocation;

    private String userAddress;

    public UserInfo(int id, int userID) {
        this.id = id;
        this.userID = userID;
    }

    public UserInfo() {
    }

    public UserInfo(int id, int userID, String userName, String userPhonenum, String userProfect, String userLocation, String userAddress) {
        this.id = id;
        this.userID = userID;
        this.userName = userName;
        this.userPhonenum = userPhonenum;
        this.userProfect = userProfect;
        this.userLocation = userLocation;
        this.userAddress = userAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhonenum() {
        return userPhonenum;
    }

    public void setUserPhonenum(String userPhonenum) {
        this.userPhonenum = userPhonenum;
    }

    public String getUserProfect() {
        return userProfect;
    }

    public void setUserProfect(String userProfect) {
        this.userProfect = userProfect;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
