package com.example.psychologicalcounselingsystem.mybatis.DAO;

import com.example.psychologicalcounselingsystem.mybatis.entity.Rating;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RatingMapper {

        //查找评价表
        @Select("SELECT * FROM rating WHERE ratingID = #{ratingID}")
        Rating getRating(int ratingID);

        //增
        @Insert("INSERT INTO rating(userID, counselorID, appointmentID, rating, comment) VALUES(#{userID}, #{counselorID}, #{appointmentID}, #{rating}, #{comment})")
        @Options(useGeneratedKeys = true, keyProperty = "ratingID")
        boolean addRating(Rating rating);

        //全
        @Select("SELECT * FROM rating")
        List<Rating> getAllRatings();

        //改rating评价,comment内容
        @Update("UPDATE rating set rating = #{rating} , comment=#{comment}  where ratingID = #{ratingID}")
        boolean updateRatingUser(Rating rating);

        //全改
        @Update("UPDATE rating set ratingID= #{ratingID},userID=#{userID},counselorID=#{counselorID},appointmentID=#{appointmentID},rating = #{rating} , comment=#{comment}   where ratingID = #{ratingID}")
        boolean updateRating(Rating rating);
        //删
        @Delete("delete from rating where ratingID = {ratingID}")
        boolean deleteRating(int ratingID);
}


