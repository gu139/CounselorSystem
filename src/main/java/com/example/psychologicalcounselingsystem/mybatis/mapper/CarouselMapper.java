package com.example.psychologicalcounselingsystem.mybatis.mapper;

import com.example.psychologicalcounselingsystem.mybatis.entity.Carousel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CarouselMapper {
    //id 查找
    @Select("select * from carousel where id = #{id}")
    Carousel getCarousel(int id);

    //所有
    @Select("select * from carousel")
    List<Carousel> getAllCarousel();

    //id 修改
    @Update("update carousel set imgSrc=#{imgSrc} where id = #{id}")
    boolean updateCarousel(Carousel carousel);

    //增
    @Insert("insert into carousel (imgSrc) values (#{imgSrc});")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    boolean addCarousel(Carousel carousel);

    //删
    @Delete("delete from carousel where id = #{id}")
    boolean deleteCarousel(int id);
}
