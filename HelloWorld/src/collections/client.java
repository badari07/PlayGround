package collections;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class client {

    static class Car{
        private String name;
        private String model;
        private String color;
        private int year;
        private int price;

        public Car(String name, String model, String color, int year, int price) {
            this.name = name;
            this.model = model;
            this.color = color;
            this.year = year;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    '}';
        }

    }

     public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", "Black", 2019, 20000);
        Car c2 = new Car("Honda", "Civic", "White", 2018, 25000);
        Car c3 = new Car("Suzuki", "Cultus", "Grey", 2017, 15000);
        Car c4 = new Car("Toyota", "Prius", "Blue", 2016, 30000);
        Car c5 = new Car("Honda", "City", "Red", 2015, 18000);

        List<Car> cars = Arrays.asList(c1, c2, c3, c4, c5);

        Comparator<Car> C = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.year - o2.year;
            }
        };

        Collections.sort(cars,C);

         System.out.println(cars);






//        Set<Car> cars = new TreeSet<>();
//        cars.add(c1);
//        cars.add(c2);
//        cars.add(c3);
//        cars.add(c4);
//        cars.add(c5);
//
//        List<Car> car1 = List.of(c1, c2, c3, c4, c5);
//        // System.out.println(car1);
//         System.out.println(cars);
//       // cars.add(c1);

//         Consumer<Car> consumer = (Car car) -> {
//             System.out.println(car);
//         };
//
//         consumer.accept(c1);

//         B b = new B();
//         System.out.println(b.test("Hello", 3));




         BiPredicate<String,Integer> biPredicate = (String s, Integer i) ->  s.length() > i;

         System.out.println(biPredicate.test("Hello", 3));

         BiPredicate<String,Integer> biPredicate1 = new BiPredicate<String, Integer>() {
             @Override
             public boolean test(String s, Integer integer) {
                 return s.length() > integer;
             }
         };
         System.out.println(biPredicate1.test("Hello", 3));






    }





   // List<Car> car1 = List.of(c1, c2, c3, c4, c5);
}



