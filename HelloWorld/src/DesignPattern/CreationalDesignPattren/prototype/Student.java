package DesignPattern.CreationalDesignPattren.prototype;

public class Student implements prototype<Student>{
    private String name;
    private int age;
    private String address;
    private long phone;
    private String email;

    public Student() {

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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, int age, String address, long phone, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
        this.phone = student.phone;
        this.email = student.email;
    }


    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
