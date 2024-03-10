package com.example.psychologicalcounselingsystem.mybatis.mapper;

import com.example.psychologicalcounselingsystem.mybatis.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    //id查找
    @Select("select * from userinfo where id = #{id}")
    @ResultMap("userInfoMap")
    UserInfo getUserInfoById(@Param("id") int id);

    // 根据userID查询userinfo
    @Select("select * from userinfo where userID = #{userID}")
    @ResultMap("userInfoMap")
    UserInfo getUserInfoByUserID(@Param("userID") int userID);

    // 查询所有userinfo
    @Select("select * from userinfo")
    @ResultMap("userInfoMap")
    List<UserInfo> getAllUserInfos();

    // 添加userinfo
    @Insert("insert into userinfo (userID, userName,userPhonenum,userProfect,userLocation,userAddress) values (#{userID}, #{userName},#{userPhonenum},#{userProfect},#{userLocation},#{userAddress})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    boolean addUserInfo(UserInfo userInfo);

    // 修改userinfo
    @Update("update userinfo set  userName = #{userName} where Id = #{id}")
    @ResultMap("userInfoMap")
    boolean updateUserInfoName(UserInfo userInfo);

    @Update("UPDATE userinfo SET userID = #{userInfo.userID}, userName = #{userInfo.userName}, userPhonenum = #{userInfo.userPhonenum}, userProfect = #{userInfo.userProfect}, userLocation = #{userInfo.userLocation}, userAddress = #{userInfo.userAddress} WHERE id = #{userInfo.id}")
    @ResultMap("userInfoMap")
    boolean updateUserInfo(@Param("userInfo") UserInfo userInfo);
    // 删除userinfo
    @Delete("delete from userinfo where id = #{id}")
    @ResultMap("userInfoMap")
    boolean deleteUserInfo(@Param("id") int id);

    @Delete("delete from userinfo where userID =#{userID}")
    @ResultMap("userInfoMap")
    boolean deleteUserInfoByUserID(@Param("userID")int userID);
}
