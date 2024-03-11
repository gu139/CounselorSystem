package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.UserInfo;
import com.example.psychologicalcounselingsystem.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/{id}")
    public UserInfo getUserInfoById(@PathVariable Integer id) {
        return userInfoService.getUserInfoById(id);
    }

    @GetMapping("/byUserID/{userID}")
    public UserInfo getUserInfoByUserID(@PathVariable int userID) {
        return userInfoService.getUserInfoByUserID(userID);
    }

    @GetMapping("/all")
    public List<UserInfo> getAllUserInfos() {
        return userInfoService.getAllUserInfos();
    }

    @PostMapping("/add")
    public boolean addUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.addUserInfo(userInfo);
    }

    @PostMapping("/update")
    public boolean updateUserInfo(@RequestBody UserInfo userInfo){
        return userInfoService.updateUserInfo(userInfo);
    }

    //根据userID删除userinfo
    @PostMapping("/deleteByUserID/{userID}")
    public boolean deleteUserInfoByUserID(@PathVariable("userID") Integer userID){return userInfoService.deleteUserInfoByUserID(userID);}

    @PostMapping("/delete/{id}")
    public boolean deleteUserInfo(@PathVariable("id") Integer id){return userInfoService.deleteUserInfo(id);}
}