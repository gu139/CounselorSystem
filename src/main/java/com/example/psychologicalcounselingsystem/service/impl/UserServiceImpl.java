package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.service.UserService;
import com.example.psychologicalcounselingsystem.mybatis.entity.User;
import com.example.psychologicalcounselingsystem.mybatis.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByUserID(int userID) {
        return userMapper.getUserByUserID(userID);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user) > 0;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user) > 0;
    }

    @Override
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id) > 0;
    }
}