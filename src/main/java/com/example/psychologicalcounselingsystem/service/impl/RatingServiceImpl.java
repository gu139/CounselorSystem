package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.mybatis.DAO.RatingMapper;
import com.example.psychologicalcounselingsystem.mybatis.entity.Rating;
import com.example.psychologicalcounselingsystem.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public Rating getRating(int ratingID) {
        return ratingMapper.getRating(ratingID);
    }

    @Override
    public boolean addRating(Rating rating) {
        return ratingMapper.addRating(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingMapper.getAllRatings();
    }

    @Override
    public boolean updateRatingUser(Rating rating) {
        return ratingMapper.updateRatingUser(rating);
    }

    @Override
    public boolean updateRating(Rating rating) {
        return ratingMapper.updateRating(rating);
    }

    @Override
    public boolean deleteRating(int ratingID) {
        return ratingMapper.deleteRating(ratingID);
    }
}
