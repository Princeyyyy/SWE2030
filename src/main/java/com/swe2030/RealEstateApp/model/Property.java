package com.swe2030.RealEstateApp.model;

import com.swe2030.RealEstateApp.model.Appointment;

import java.util.ArrayList;
import java.util.List;

public class Property{

    private String address;
    private double price;
    private boolean available;
    private List<Appointment> appointments;

    public Property(int propertyID, String propertyName, String city, double price, String address) {
        this.address = address;
        this.price = price;
        this.available = true;
        this.appointments = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}