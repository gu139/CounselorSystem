package com.example.psychologicalcounselingsystem.controller;


import com.example.psychologicalcounselingsystem.mybatis.entity.Counselor;
import com.example.psychologicalcounselingsystem.service.CounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/counselor")
public class CounselorController {

    @Autowired
    private CounselorService counselorService;

    @PostMapping("/add")
    public Counselor addCounselor(@RequestBody Counselor counselor) {
        return counselorService.addCounselor(counselor);
    }

    @GetMapping("/find/{id}")
    public Counselor getCounselor(@PathVariable("id") Integer counselorID) {
        return counselorService.getCounselorById(counselorID);
    }

    @PutMapping("/update")
    public Counselor updateCounselor(@RequestBody Counselor counselor) {
        return counselorService.updateCounselor(counselor);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCounselor(@PathVariable("id") Integer counselorID) {
        counselorService.deleteCounselor(counselorID);
    }
}
