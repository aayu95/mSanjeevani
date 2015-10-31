package shugal.com.msanjeevani;

/**
 * Created by abhishek on 31/10/15.
 */
public class SampleData {

    private int id;
    private String patient_name;
    private int age;
    private String gender;
    private String sample;
    private String date;
    private String time;

    public SampleData() {

    }

    public SampleData(String patient_name,
                           int age,
                           String gender,
                           String sample,
                           String date,
                           String time) {
        this.patient_name = patient_name;
        this.age = age;
        this.gender = gender;
        this.sample = sample;
        this.date = date;
        this.time = time;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String hospital) {
        this.sample = hospital;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
