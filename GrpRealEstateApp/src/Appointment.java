public class Appointment extends Estate {
    private int tenantID;
    private String agentName;
    private String appointmentDate;
    private String propertyAddress;
    private String agentEmail;


    public Appointment(long id, int tenantID, String agentName, String appointmentDate, String propertyAddress, String agentEmail) {
        super(id);
        this.tenantID = tenantID;
        this.agentName = agentName;
        this.appointmentDate = appointmentDate;
        this.propertyAddress = propertyAddress;
        this.agentEmail = agentEmail;
    }

    public int getTenantID() {
        return tenantID;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }
}
