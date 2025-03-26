package genric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Animals a = new Animals();
        Dog a1 = new Dog();
        Animals a2 = new Animals();
        Dog a3 = new Dog();
//        a1.bark();
//        a.eat();

        List<Animals> list = new ArrayList<>();
        List<Dog> list1 = new ArrayList<>();
        printList(list1);

        printList(list);
        printList(list1);

        list.add(a2);
        System.out.println(list);




    }

    private static void printList(List<? extends Animals> list) {
        for (Animals a : list) {
            System.out.println(a);
        }
    }
}

