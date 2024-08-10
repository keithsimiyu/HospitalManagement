public class Outpatient extends Patient{
    private String attendingDoctor;
    private int appointmentDate;
    private int appointmentNumber;


    public Outpatient(String patientId, String name, int age, String address, String attendingDoctor,
            int appointmentDate, int appointmentNumber) {
        super(patientId, name, age, address);
        this.attendingDoctor = attendingDoctor;
        this.appointmentDate = appointmentDate;
        this.appointmentNumber = appointmentNumber;
    }


    public String getAttendingDoctor() {
        return attendingDoctor;
    }


    public void setAttendingDoctor(String attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }


    public int getAppointmentDate() {
        return appointmentDate;
    }


    public void setAppointmentDate(int appointmentDate) {
        this.appointmentDate = appointmentDate;
    }


    public int getAppointmentNumber() {
        return appointmentNumber;
    }


    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public void displayInfo(){
        System.out.println("Displaying Outpatient details:");
        System.out.println("PatientId:"+ getPatientId());
        System.out.println("Patient Name:"+ getName());
        System.out.println("Patient Age:"+ getAge());
        System.out.println("Patient address:"+ getAddress());
        System.out.println("Attending Doctor:"+ attendingDoctor);
        System.out.println("AppointmentDate:" + appointmentDate);
        System.out.println("AppointmentNumber:"+ appointmentDate);
    }
    

}
