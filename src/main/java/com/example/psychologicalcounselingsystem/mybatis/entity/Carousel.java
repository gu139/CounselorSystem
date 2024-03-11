package com.example.psychologicalcounselingsystem.mybatis.entity;



public class Carousel {


    private Integer id;
    private String imgSrc;

    public Carousel(int id, String imgSrc) {
        this.id = id;
        this.imgSrc = imgSrc;
    }

    public Carousel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
}
