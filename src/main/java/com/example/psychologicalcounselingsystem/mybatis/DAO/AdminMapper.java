package com.example.psychologicalcounselingsystem.mybatis.DAO;

import com.example.psychologicalcounselingsystem.mybatis.entity.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where adminID = #{adminID}")
    Admin findAdmin(Integer adminID);

    @Select("select * from admin")
    List<Admin> findAllAdmin();

    @Insert("INSERT into admin(adminID,adminPassword) values (#{adminID},#{adminPassword})")
    boolean insertAdmin(Admin admin);

    @Update("update admin set adminPassword=#{adminPassword} where adminID=#{adminID}")
    boolean updateAdmin(Admin admin);

    @Delete("delete from admin where adminID=#{adminID}")
    boolean delAdmin(Integer adminID);
}

