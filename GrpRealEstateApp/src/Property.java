import java.util.ArrayList;
import java.util.List;

public class Property extends Estate {
    private String address;
    private double price;
    private boolean isAvailable;
    private List<Appointment> appointments;


    public Property(long id, String address, double price, boolean isAvailable) {
        super(id);
        this.address = address;
        this.price = price;
        this.isAvailable = isAvailable;
        this.appointments = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
