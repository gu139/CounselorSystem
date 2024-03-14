package com.example.psychologicalcounselingsystem.mybatis.DAO;


import com.example.psychologicalcounselingsystem.mybatis.entity.Counselor;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CounselorMapper {
    @Insert("INSERT INTO counselor (counselorID, counselorPassword) VALUES (#{counselorID}, #{counselorPassword})")
    @Options(useGeneratedKeys = true, keyProperty = "counselorID")
    int insert(Counselor counselor);

    @Select("SELECT * FROM counselor WHERE counselorID = #{counselorID}")
    Counselor selectById(Integer counselorID);

    @Update("UPDATE counselor SET counselorPassword = #{counselorPassword} WHERE counselorID = #{counselorID}")
    int update(Counselor counselor);

    @Delete("DELETE FROM counselor WHERE counselorID = #{counselorID}")
    int delete(Integer counselorID);
}
