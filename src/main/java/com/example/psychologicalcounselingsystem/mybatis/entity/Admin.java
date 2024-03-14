package com.example.psychologicalcounselingsystem.mybatis.entity;

import java.io.Serializable;


public class Admin implements Serializable {
    private Integer adminID;
    private String adminPassword;

    public Admin(Integer adminID, String adminPassword) {
        this.adminID = adminID;
        this.adminPassword = adminPassword;
    }

    public Admin() {
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
