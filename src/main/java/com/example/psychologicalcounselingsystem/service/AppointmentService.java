package com.example.psychologicalcounselingsystem.service;

import com.example.psychologicalcounselingsystem.mybatis.entity.Appointment;

import java.util.List;


public interface AppointmentService {
    Appointment addAppointment(Appointment appointment);
    Appointment getAppointmentById(Integer appointmentID);
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Appointment appointment);
    void deleteAppointment(Integer appointmentID);
}