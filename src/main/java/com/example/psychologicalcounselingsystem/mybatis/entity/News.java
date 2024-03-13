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
    private String newsContent;

    //没有newsID,king和Img
    public News(){

    }

    public News(Integer newsID, Integer kind, String imgSrc, String newsTitle, Date newsTime, String newsNote ,String newsContent) {
        this.newsID = newsID;
        this.kind = kind;
        this.imgSrc = imgSrc;
        this.newsTitle = newsTitle;
        this.newsTime = newsTime;
        this.newsNote = newsNote;
        this.newsContent=newsContent;
    }

    public Integer getNewsID() {
        return newsID;
    }

    public void setNewsID(Integer newsID) {
        this.newsID = newsID;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
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

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }


}
