
import java.util.UUID;



public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String address;


    public Patient(String patientId, String name, int age, String address) {
        this.patientId = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }




    public String getPatientId() {
        return patientId;
    }   

    public abstract void displayInfo();

    
}
