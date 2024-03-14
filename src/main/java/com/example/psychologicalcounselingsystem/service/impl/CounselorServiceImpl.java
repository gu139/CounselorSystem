package com.example.psychologicalcounselingsystem.service.impl;


import com.example.psychologicalcounselingsystem.mybatis.entity.Counselor;
import com.example.psychologicalcounselingsystem.mybatis.DAO.CounselorMapper;
import com.example.psychologicalcounselingsystem.service.CounselorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounselorServiceImpl implements CounselorService {

    @Autowired
    private CounselorMapper counselorMapper;

    @Override
    public Counselor addCounselor(Counselor counselor) {
        counselorMapper.insert(counselor);
        return counselor;
    }

    @Override
    public Counselor getCounselorById(Integer counselorID) {
        return counselorMapper.selectById(counselorID);
    }

    @Override
    public Counselor updateCounselor(Counselor counselor) {
        counselorMapper.update(counselor);
        return counselor;
    }

    @Override
    public void deleteCounselor(Integer counselorID) {
        counselorMapper.delete(counselorID);
    }
}