package com.example.psychologicalcounselingsystem.mybatis.entity;

import java.io.Serializable;

public class Counselor implements Serializable {
    private Integer counselorID;
    private String counselorPassword;

    public Counselor(Integer counselorID, String counselorPassword) {
        this.counselorID = counselorID;
        this.counselorPassword = counselorPassword;
    }

    public Integer getCounselorID() {
        return counselorID;
    }

    public void setCounselorID(Integer counselorID) {
        this.counselorID = counselorID;
    }

    public String getCounselorPassword() {
        return counselorPassword;
    }

    public void setCounselorPassword(String counselorPassword) {
        this.counselorPassword = counselorPassword;
    }
}
