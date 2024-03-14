package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.Rating;
import com.example.psychologicalcounselingsystem.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/find/{ratingID}")
    public Rating getRating( @PathVariable int ratingID){
        return ratingService.getRating(ratingID);
    }

    @PostMapping("/add")
    public boolean addRating(@RequestBody Rating rating){
        return ratingService.addRating(rating);
    }

    @GetMapping("/findAll")
    public List<Rating> getAllRatings(){
        return ratingService.getAllRatings();
    }

    @PutMapping("/update/user")
    public boolean updateRatingUser(@RequestBody Rating rating){
        return ratingService.updateRatingUser(rating);
    }

}
