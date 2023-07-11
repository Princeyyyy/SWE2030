package com.swe2030.RealEstateApp.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Agent {

    private String name;
    private String agencyNameString;
    private String contact;
    private List<Property> AgentProperties;

    

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

   public List<Property> getAgentProperties() {
        return AgentProperties;
    }

    public void setAgentProperties(List<Property> agentProperties) {
        AgentProperties = agentProperties;
    }

    public String getAgencyNameString() {
        return agencyNameString;
    }

    public void setAgencyNameString(String agencyNameString) {
        this.agencyNameString = agencyNameString;
    }

}