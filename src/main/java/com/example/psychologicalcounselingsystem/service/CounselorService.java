package com.example.psychologicalcounselingsystem.service;


import com.example.psychologicalcounselingsystem.mybatis.entity.Counselor;

public interface CounselorService {
    Counselor addCounselor(Counselor counselor);
    Counselor getCounselorById(Integer counselorID);
    Counselor updateCounselor(Counselor counselor);
    void deleteCounselor(Integer counselorID);
}