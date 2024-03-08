package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoService {
    UserInfo getUserInfoById(int id);
    UserInfo getUserInfoByUserID(int userID);
    List<UserInfo> getAllUserInfos();
    int addUserInfo(UserInfo userInfo);
    int updateUserInfoAll(UserInfo userInfo);
    int updateUserInfoName(UserInfo userInfo);
    int deleteUserInfo(int id);
}