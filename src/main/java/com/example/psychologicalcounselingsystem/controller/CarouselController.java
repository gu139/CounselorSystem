package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.Carousel;
import com.example.psychologicalcounselingsystem.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CarouselController类，处理轮播图的请求
@RestController
@RequestMapping("/carousel")
public class CarouselController {

    // 注入CarouselService对象
    @Autowired
    private CarouselService carouselService;

    // 根据id获取轮播图
    @GetMapping("/{id}")
    public Carousel getCarousel(@PathVariable int id) {
        return carouselService.getCarousel(id);
    }

    // 获取所有轮播图
    @GetMapping("/")
    public List<Carousel> getAllCarousel() {
        return carouselService.getAllCarousel();
    }

    // 根据id修改轮播图
    @PutMapping("/update/{id}")
    public boolean updateCarousel(@PathVariable int id, @RequestBody Carousel carousel) {
        carousel.setId(id);
        return carouselService.updateCarousel(carousel);
    }

    // 增加轮播图
    @PostMapping("/add")
    public boolean addCarousel(@RequestBody Carousel carousel) {
        return carouselService.addCarousel(carousel);
    }

    // 根据id删除轮播图
    @DeleteMapping("/delete/{id}")
    public boolean deleteCarousel(@PathVariable int id) {
        return carouselService.deleteCarousel(id);
    }
}