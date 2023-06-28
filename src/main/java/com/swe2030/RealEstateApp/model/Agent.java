package com.swe2030.RealEstateApp.model;


public class Agent {

    private String name;
    private String contact;
    private Property property;

    public Agent(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public Property getProperty() {
        return property;
    }

    public void addProperty(Property property) {
        this.property = property;
    }


}