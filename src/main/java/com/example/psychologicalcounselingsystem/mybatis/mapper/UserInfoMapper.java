package com.example.psychologicalcounselingsystem.mybatis.mapper;

import com.example.psychologicalcounselingsystem.mybatis.entity.User;
import com.example.psychologicalcounselingsystem.mybatis.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    @Select("select * from userinfo where Id = #{id}")
    @ResultMap("userinfoMap")
    UserInfo getUserInfoById(@Param("id") int id);

    // 根据userID查询userinfo
    @Select("select * from userinfo where userID = #{userID}")
    @ResultMap("userinfoMap")
    UserInfo getUserInfoByUserID(@Param("userID") int userID);

    // 查询所有userinfo
    @Select("select * from userinfo")
    @ResultMap("userinfoMap")
    List<UserInfo> getAllUserInfos();

    // 添加userinfo
    @Insert("insert into userinfo (userID, userName,userPhonenum,userProfect,userLocation,userAddress) values (#{userID}, #{userName},#{userPhonenum},#{userProfect},#{userLocation},#{userAddress})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addUserInfo(UserInfo userInfo);

    // 修改userinfo
    @Update("update userinfo set  userName = #{userName} where Id = #{id}")
    int updateUserInfoName(UserInfo userInfo);

    @Update("UPDATE userinfo SET userID = #{userID}, userName = #{userName}, userPhonenum = #{userPhonenum}, userProfect = #{userProfect}, userLocation = #{userLocation}, userAddress = #{userAddress} WHERE id = #{id}")
    int updateUserInfoAll(UserInfo userInfo);
    // 删除userinfo
    @Delete("delete from userinfo where Id = #{id}")
    int deleteUserInfo(@Param("id") int id);
}
