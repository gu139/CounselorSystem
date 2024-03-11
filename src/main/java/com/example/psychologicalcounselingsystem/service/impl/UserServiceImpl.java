package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.service.UserService;
import com.example.psychologicalcounselingsystem.mybatis.entity.User;
import com.example.psychologicalcounselingsystem.mybatis.DAO.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByUserID(Integer userID) {
        return userMapper.getUserByUserID(userID);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public boolean deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }
}