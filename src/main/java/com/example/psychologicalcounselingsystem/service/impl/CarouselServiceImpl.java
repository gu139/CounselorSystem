package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.mybatis.entity.Carousel;
import com.example.psychologicalcounselingsystem.mybatis.mapper.CarouselMapper;
import com.example.psychologicalcounselingsystem.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// CarouselServiceImpl类，实现CarouselService接口
@Service
public class CarouselServiceImpl implements CarouselService {

    // 注入CarouselMapper对象
    @Autowired
    private CarouselMapper carouselMapper;

    // 根据id查找轮播图
    @Override
    public Carousel getCarousel(int id) {
        return carouselMapper.getCarousel(id);
    }

    // 获取所有轮播图
    @Override
    public List<Carousel> getAllCarousel() {
        return carouselMapper.getAllCarousel();
    }

    // 根据id修改轮播图
    @Override
    public boolean updateCarousel(Carousel carousel) {
        return carouselMapper.updateCarousel(carousel);
    }

    // 增加轮播图
    @Override
    public boolean addCarousel(Carousel carousel) {
        return carouselMapper.addCarousel(carousel);
    }

    // 根据id删除轮播图
    @Override
    public boolean deleteCarousel(int id) {
        return carouselMapper.deleteCarousel(id);
    }
}