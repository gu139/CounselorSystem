package com.example.psychologicalcounselingsystem.service.impl;

import com.example.psychologicalcounselingsystem.mybatis.entity.Appointment;
import com.example.psychologicalcounselingsystem.mybatis.DAO.AppointmentMapper;
import com.example.psychologicalcounselingsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Override
    public Appointment addAppointment(Appointment appointment) {
        appointmentMapper.insert(appointment);
        return appointment;
    }

    @Override
    public Appointment getAppointmentById(Integer appointmentID) {
        return appointmentMapper.selectById(appointmentID);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentMapper.selectAll();
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        appointmentMapper.update(appointment);
        return appointment;
    }

    @Override
    public void deleteAppointment(Integer appointmentID) {
        appointmentMapper.delete(appointmentID);
    }
}