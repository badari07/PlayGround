package DesignPattern.prototype;

public class client {
    public static void main(String[] args) {
        StudentRegistory studentRegistory = new StudentRegistory();
        Student student = new Student();
        student.setName("John");
        studentRegistory.registerStudent("1", student);

        Student student1 = studentRegistory.getStudent("1");
        System.out.println(student1.getName());
    }
}
