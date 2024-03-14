package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    Rating getRating(int ratingID);

    boolean addRating(Rating rating);

    List<Rating> getAllRatings();

    boolean updateRatingUser(Rating rating);

    boolean updateRating(Rating rating);

    boolean deleteRating(int ratingID);
}
