package com.example.psychologicalcounselingsystem.mybatis.DAO;

import com.example.psychologicalcounselingsystem.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    // 根据id查询user
    @Select("select * from user where Id = #{id}")
    @ResultMap("userMap")
    User getUserById(@Param("id") Integer id);

    // 根据userID查询user
    @Select("select * from user where userID = #{userID}")
    @ResultMap("userMap")
    User getUserByUserID(@Param("userID") Integer userID);

    // 查询所有user
    @Select("select * from user")
    @ResultMap("userMap")
    List<User> getAllUsers();

    // 添加user
    @Insert("insert into user (userID, userPassword) values (#{userID}, #{userPassword})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    boolean addUser(User user);

    // 修改user
    @Update("update user set userID = #{userID}, userPassword = #{userPassword} where Id = #{id}")
    boolean updateUser(User user);

    // 删除user
    // 删除user
    @Delete("delete from user where userID = #{userid}")
    boolean deleteUser(@Param("userid") Integer userid);

    @Delete("delete from user where Id = #{id}")
    boolean deleteUser1(@Param("id") Integer id);


}