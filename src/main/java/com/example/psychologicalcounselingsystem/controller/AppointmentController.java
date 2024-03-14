package com.example.psychologicalcounselingsystem.controller;

import com.example.psychologicalcounselingsystem.mybatis.entity.Appointment;
import com.example.psychologicalcounselingsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/add")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentService.addAppointment(appointment);
    }

    @GetMapping("/find/{id}")
    public Appointment getAppointment(@PathVariable("id") Integer appointmentID) {
        return appointmentService.getAppointmentById(appointmentID);
    }

    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @PutMapping("/update")
    public Appointment updateAppointment(@RequestBody Appointment appointment) {
        return appointmentService.updateAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAppointment(@PathVariable("id") Integer appointmentID) {
        appointmentService.deleteAppointment(appointmentID);
    }
}