package com.example.psychologicalcounselingsystem.mybatis.entity;

import java.io.Serializable;
import java.sql.Date;

public class News implements Serializable {
    private Integer newsID;
    private Integer kind;
    private String imgSrc;
    private String newsTitle;
    private Date newsTime;
    private String newsNote;

    //没有newsID,king和Img
    public News(String newsTitle, Date newsTime, String newsNote) {
        this.newsTitle = newsTitle;
        this.newsTime = newsTime;
        this.newsNote = newsNote;
    }
    //没有newsID
    public News(Integer kind, String imgSrc, String newsTitle, Date newsTime, String newsNote) {
        this.kind = kind;
        this.imgSrc = imgSrc;
        this.newsTitle = newsTitle;
        this.newsTime = newsTime;
        this.newsNote = newsNote;
    }
    //没有king和Img
    public News(Integer newsID, String newsTitle, Date newsTime, String newsNote) {
        this.newsID = newsID;
        this.newsTitle = newsTitle;
        this.newsTime = newsTime;
        this.newsNote = newsNote;
    }

    public News(Integer newsID, Integer kind, String imgSrc, String newsTitle, Date newsTime, String newsNote) {
        this.newsID = newsID;
        this.kind = kind;
        this.imgSrc = imgSrc;
        this.newsTitle = newsTitle;
        this.newsTime = newsTime;
        this.newsNote = newsNote;
    }

    public Integer getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsNote() {
        return newsNote;
    }

    public void setNewsNote(String newsNote) {
        this.newsNote = newsNote;
    }
}
