package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.UserInfo;


import java.util.List;

public interface UserInfoService {
    UserInfo getUserInfoById(int id);
    UserInfo getUserInfoByUserID(int userID);
    List<UserInfo> getAllUserInfos();
    boolean addUserInfo(UserInfo userInfo);
    boolean updateUserInfo(UserInfo userInfo);
    boolean updateUserInfoName(UserInfo userInfo);
    boolean deleteUserInfo(int id);
    boolean deleteUserInfoByUserID(int userID);
}