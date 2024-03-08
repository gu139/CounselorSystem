package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.mybatis.entity.UserInfo;
import com.example.psychologicalcounselingsystem.mybatis.mapper.UserInfoMapper;
import com.example.psychologicalcounselingsystem.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoById(int id) {
        return userInfoMapper.getUserInfoById(id);
    }

    @Override
    public UserInfo getUserInfoByUserID(int userID) {
        return userInfoMapper.getUserInfoByUserID(userID);
    }

    @Override
    public List<UserInfo> getAllUserInfos() {
        return userInfoMapper.getAllUserInfos();
    }

    @Override
    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.addUserInfo(userInfo);
    }

    @Override
    public int updateUserInfoName(UserInfo userInfo){
        return userInfoMapper.updateUserInfoName(userInfo);
    }

    @Override
    public int updateUserInfoAll(UserInfo userInfo){
        return userInfoMapper.updateUserInfoAll(userInfo);
    }

    @Override
    public int deleteUserInfo(int id){
        return userInfoMapper.deleteUserInfo(id);
    }
}