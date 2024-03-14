package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {

    Admin findAdmin(Integer adminID);

    List<Admin> findAllAdmin();

    boolean insertAdmin(Admin admin);

    boolean updateAdmin(Admin admin);

    boolean delAdmin(Integer adminID);
}
