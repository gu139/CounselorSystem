package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.Admin;
import com.example.psychologicalcounselingsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/find/{adminID}")
    public Admin findAdmin(@PathVariable Integer adminID){
        return adminService.findAdmin(adminID);
    }

    @GetMapping("/findAll")
    public List<Admin> findAllAdmin(){
        return adminService.findAllAdmin();
    }

    @PutMapping("/update")
    public boolean updateAdmin(@RequestBody Admin admin){return adminService.updateAdmin(admin);}

    @PostMapping("/add")
    public boolean addAdmin(@RequestBody Admin admin){return adminService.insertAdmin(admin);}

    @DeleteMapping("/del/{adminID}")
    public boolean delAdmin(@PathVariable Integer adminID){return adminService.delAdmin(adminID);}
}
