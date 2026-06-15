class Patient {
    void registerPatient(String name) {
        System.out.println(name + " has been registered.");
    }
    void bookAppointment(String doctor) {
        System.out.println("Appointment booked with Dr. " + doctor);
    }
    void generateBill(int amount) {
        System.out.println("Bill Amount: Rs." + amount);
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.registerPatient("Raghavi");
        p1.bookAppointment("Kumar");
        p1.generateBill(500);
    }
}
