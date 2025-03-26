package DesignPattern.CreationalDesignPattren.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistory {
    private Map<String, Student> studentMap = new HashMap<>();

    public void registerStudent(String key, Student student) {
        studentMap.put(key, student);
    }

    public Student getStudent(String key) {
        return studentMap.get(key); // Return a cloned object
    }


}
