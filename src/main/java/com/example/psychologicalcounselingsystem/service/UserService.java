package com.example.psychologicalcounselingsystem.service;
import com.example.psychologicalcounselingsystem.mybatis.entity.User;

import java.util.List;

public interface UserService {
    // 根据id查询user
    User getUserById(Integer id);

    // 根据userID查询user
    User getUserByUserID(Integer userID);

    // 查询所有user
    List<User> getAllUsers();

    // 添加user
    boolean addUser(User user);

    // 修改user
    boolean updateUser(User user);

    // 删除user
    boolean deleteUser(Integer id);

}