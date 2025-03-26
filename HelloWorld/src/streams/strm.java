package streams;

import collections.Car;
import collections.client;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class strm {

    static class Car {
        private String name;
        private String model;
        private String color;
        private int year;
        private int price;

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

        public Car(String name, String model, String color, int year, int price) {
            this.name = name;
            this.model = model;
            this.color = color;
            this.year = year;
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public class PrimeNumber {
            public static boolean isPrime(int num) {
                if (num <= 1) return false;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) return false;
                }
                return true;
            }


    }
    public static void main(String[] args) {


        int x = 150;
        int count = 0;
        for (int y = x; y > 0; y = (x & (y - 1))) {
            count++;
            System.out.println("Hey!");

        }
        System.out.println(count);

        Car c1 = new Car("Toyota", "Corolla", "Black", 2019, 20000);
        Car c2 = new Car("Honda", "Civic", "White", 2018, 25000);
        Car c3 = new Car("Suzuki", "Cultus", "Grey", 2017, 15000);
        Car c4 = new Car("Toyota", "Prius", "Blue", 2016, 30000);
        Car c5 = new Car("Honda", "City", "Red", 2015, 18000);

        List<Car> cars = Arrays.asList(c1, c2, c3, c4, c5);

//        Stream<Car> carStream = cars.stream();

        Stream<Car> carsStream = cars.stream();

        carsStream.forEach(c -> System.out.println(c.name));
     cars.stream().filter(c -> c.year > 2017).forEach(System.out::println);
    List<Integer> prices = cars.stream().filter(c -> c.price > 15000).map(c -> c.price).toList();
        System.out.println(prices);

        List<String> names = List.of("Alice", "Bob", "Charlie", "badari", "Bob", "David");

        Stream<String> namesStream = names.stream();

        List<String> b = names.stream().filter(c -> c.startsWith("B")).map(String::toUpperCase).distinct().toList();
        System.out.println(b);


        System.out.println(PrimeNumber.isPrime(2));



//     carStream.filter(car -> car.price > 20000).forEach(System.out::println);
//      cars.stream().map(car -> car.price).toList().stream().map(price -> price + 1000).forEach(System.out::println);
//

//        try {
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the number of elements in the array: ");
//            int[] arr = new int[sc.nextInt()];
//            System.out.println("im here to test");
//            System.out.println("Enter the elements of the array: ");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            System.out.println(arr);
//
//
//        } catch (Exception e) {
//            System.out.println("Invalid input");
//
//        }finally {
//            System.out.println("Goodbye");
//        }
//        System.out.println("im here to test agaign");
//
//    }
    }

}}


