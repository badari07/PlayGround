package DesignPattern.Builder;

public class Student {
    private String name;
    private int age;
    private String address;
    private int phone;
    private String email;

    public Student(StudentBuilder studentBuilder) {
        this.name =  studentBuilder.name;
        this.age = studentBuilder.age;
        this.address = studentBuilder.address;
        this.phone = studentBuilder.phone;
        this.email = studentBuilder.email;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String address;
        private int phone;
        private String email;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student build() {
            if(this.name == null || this.email == null) {
                throw new IllegalArgumentException("Name and email are required");
            }
            if(this.age >18) {
                throw new IllegalArgumentException("Age must be less than 18");
            }
            return new Student(this);
        }
    }

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




