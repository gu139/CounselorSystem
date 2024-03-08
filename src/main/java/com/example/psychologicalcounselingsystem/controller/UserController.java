

package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.User;
import com.example.psychologicalcounselingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 根据id查询user
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    // 根据userID查询user
    @GetMapping("/byUserID/{userID}")
    public User getUserByUserID(@PathVariable("userID") int userID) {
        return userService.getUserByUserID(userID);
    }


    // 查询所有user
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 登录
    @PostMapping("/login")
    public boolean loginUser(@RequestBody User user){
        User user1 = userService.getUserByUserID(user.getUserID());
        if (user1.getUserPassword().equals(user.getUserPassword()))
        { return true; }
        else
            return false;
    }
    // 添加user
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // 修改user
    @PutMapping("/update")
    public boolean updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // 删除user
    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable("id") int id) {
        return userService.deleteUser(id);
    }
}