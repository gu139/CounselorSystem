package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.Carousel;

import java.util.List;

// CarouselService接口，定义轮播图的业务逻辑
public interface CarouselService {
    // 根据id查找轮播图
    Carousel getCarousel(Integer id);

    // 获取所有轮播图
    List<Carousel> getAllCarousel();

    // 根据id修改轮播图
    boolean updateCarousel(Carousel carousel);

    // 增加轮播图
    boolean addCarousel(Carousel carousel);

    // 根据id删除轮播图
    boolean deleteCarousel(Integer id);
}