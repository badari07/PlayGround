package collections;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Car  implements Comparable<Car>{
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


    @Override
    public int compareTo(Car o) {
        return this.getYear() - o.getYear();
    }


}
