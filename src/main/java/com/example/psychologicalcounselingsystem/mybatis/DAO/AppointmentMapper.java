package com.example.psychologicalcounselingsystem.mybatis.DAO;

import com.example.psychologicalcounselingsystem.mybatis.entity.Appointment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    @Insert("INSERT INTO appointment (userID, counselorID, appointmentTime, postScript) VALUES (#{userID}, #{counselorID}, #{appointmentTime}, #{postScript})")
    @Options(useGeneratedKeys = true, keyProperty = "appointmentID")
    int insert(Appointment appointment);

    @Select("SELECT * FROM appointment WHERE appointmentID = #{appointmentID}")
    Appointment selectById(Integer appointmentID);

    @Select("SELECT * FROM appointment")
    List<Appointment> selectAll();

    @Update("UPDATE appointment SET userID = #{userID}, counselorID = #{counselorID}, appointmentTime = #{appointmentTime}, postScript = #{postScript} WHERE appointmentID = #{appointmentID}")
    int update(Appointment appointment);

    @Delete("DELETE FROM appointment WHERE appointmentID = #{appointmentID}")
    int delete(Integer appointmentID);
}