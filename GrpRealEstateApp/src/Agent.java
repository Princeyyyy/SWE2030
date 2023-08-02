import java.util.List;

public class Agent extends User {
    private String name;
    private String contact;
    private String agencyName;
    private List<Property> agentProperties;

    public Agent(long userId, String name, String contact) {
        super(userId);
        this.name = name;
        this.contact = contact;
        this.agencyName = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Property> getAgentProperties() {
        return agentProperties;
    }

    public void setAgentProperties(List<Property> agentProperties) {
        this.agentProperties = agentProperties;
    }
}
