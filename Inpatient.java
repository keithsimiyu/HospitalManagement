
public class Inpatient extends Patient {
    private String roomNumber;
    private String attendingDoctor;
    private int daysAdmitted;

    
    public Inpatient(String patientId, String name, int age, String address, String roomNumber, String attendingDoctor,
            int daysAdmitted) {
        super(patientId, name, age, address);
        this.roomNumber = roomNumber;
        this.attendingDoctor = attendingDoctor;
        this.daysAdmitted = daysAdmitted;
    }


    public String getRoomNumber() {
        return roomNumber;
    }


    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }


    public String getAttendingDoctor() {
        return attendingDoctor;
    }


    public void setAttendingDoctor(String attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }


    public int getDaysAdmitted() {
        return daysAdmitted;
    }


    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public void displayInfo(){
        System.out.println("Displaying Inpatient details");
        System.out.println("Patient Id: "+ getPatientId());
        System.out.println("Patient name: "+ getName());
        System.out.println("Patient age:"+ getAge());
        System.out.println("Patient Address: "+ getAddress());
        System.out.println("Attending doctor: "+ attendingDoctor);
        System.out.println("Patient Room Number:"+ roomNumber);
        System.out.println("Days admitted:"+ daysAdmitted);
    }
    
}
