package com.example.psychologicalcounselingsystem.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    private Integer appointmentID;
    private Integer userID;
    private Integer counselorID;
    private LocalDateTime appointmentTime;
    private String postScript;
}
