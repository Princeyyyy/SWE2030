package com.swe2030.RealEstateApp.model;

class Appointment {
    private int tenantID;
    private String tenantName;
    private String appointmentDate;
    private String propertyAddress;
    private String tenantEmail;

    public Appointment(int tenantID, String tenantName, String appointmentDate, String propertyAddress, String tenantEmail) {
        this.tenantID = tenantID;
        this.tenantName = tenantName;
        this.appointmentDate = appointmentDate;
        this.propertyAddress = propertyAddress;
        this.tenantEmail = tenantEmail;
    }

    public int getTenantID() {
        return tenantID;
    }

    public String getTenantName() {
        return tenantName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public String getAppointmentDetails() {
        return "Tenant ID: " + tenantID + ", Tenant Name: " + tenantName + ", Appointment Date: " + appointmentDate + ", Property Address: " + propertyAddress + ", Tenant Email: " + tenantEmail;
    }
}