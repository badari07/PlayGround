package DesignPattern.CreationalDesignPattren.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class single {
    String name;
    int age;
    String address;
    int phone;
    String email;

    private static Lock lock = new ReentrantLock();

    private static single instance = null;

    private single() {
    }

//    @Override
//    public String toString() {
//        return "single{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                ", phone=" + phone +
//                ", email='" + email + '\'' +
//                '}';
//    }

    public static single getInstance() {
        if (instance == null) {
//        synchronized(single.class) {
            lock.lock();
            if (instance == null) {
                instance = new single();
            }
            lock.unlock();
        }
        return instance;
    }

    public static single resetInstance() {
        instance = null;
        return instance;

    }

    public static void main(String[] args) {

        single s = single.getInstance();
        single s1 = single.getInstance();

        System.out.println(s ==s1);

        Thread t1 = new Thread(() -> {
            single s2 = single.getInstance();
            System.out.println(s2);
            System.out.println(Thread.currentThread().getName());

        });


        Thread t2 = new Thread(() -> {
            single s3 = single.getInstance();
            System.out.println(s3);
            System.out.println(Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
        System.out.println(s);
        System.out.println(s1);
        s.name = "John";
        s.age = 25;
        s.address = "123 Main St";
        s.phone = 1234567890;
        System.out.println(s);

    }
}


