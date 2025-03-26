package DesignPattern.CreationalDesignPattren.Builder;

public class main {
    public static void main(String[] args) {

        Student student = new Student.StudentBuilder()
                .setName("John")
                .setAge(20)
                .setAddress("1234 Main St")
                .setPhone(1234567890)
                .setEmail("abc@gamil.com")
                .build();
        System.out.println("Student: " + student);
    }
}
