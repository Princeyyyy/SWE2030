import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        // Create an Agent
        Agent agent = new Agent(random.nextLong(999), "John Doe", "0711223344");
        agent.setAgencyName("Best Properties Agency");

        // Create a Property
        Property property = new Property(random.nextLong(999), "123 Main St", 200000.0, false);

        // Create an Appointment
        Appointment appointment = new Appointment(random.nextLong(999), random.nextInt(999), "Alice", "2023-08-10", "456 Park Ave", "alice@example.com");

        // Add the appointment to the property
        property.addAppointment(appointment);

        // Set the property as the agent's property
        List<Property> agentProperties = new ArrayList<>();
        agentProperties.add(property);
        agent.setAgentProperties(agentProperties);

        // Display Agent details
        System.out.println("Agent Details:");
        System.out.println("Agent ID: " + agent.getUserId());
        System.out.println("Agent Name: " + agent.getName());
        System.out.println("Agent Contact: " + agent.getContact());
        System.out.println("Agent Agency: " + agent.getAgencyName());

        // Display Property details
        System.out.println("\nProperty Details:");
        System.out.println("Property ID: " + property.getId());
        System.out.println("Property Address: " + property.getAddress());
        System.out.println("Property Price: $" + property.getPrice());
        System.out.println("Property Availability: " + (property.isAvailable() ? "Available" : "Not Available"));

        // Display Appointment details
        System.out.println("\nAppointment Details:");
        System.out.println("Appointment ID: " + appointment.getId());
        System.out.println("Agent Name: " + appointment.getAgentName());
        System.out.println("Appointment Date: " + appointment.getAppointmentDate());
        System.out.println("Property Address: " + appointment.getPropertyAddress());
    }
}
