package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.mybatis.DAO.AdminMapper;
import com.example.psychologicalcounselingsystem.mybatis.entity.Admin;
import com.example.psychologicalcounselingsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin findAdmin(Integer adminID) {
        return adminMapper.findAdmin(adminID);
    }


    @Override
    public List<Admin> findAllAdmin() {
        return adminMapper.findAllAdmin();
    }


    @Override
    public boolean insertAdmin(Admin admin) {
        return adminMapper.insertAdmin(admin);
    }


    @Override
    public boolean updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }


    @Override
    public boolean delAdmin(Integer adminID) {
        return adminMapper.delAdmin(adminID);
    }
}
