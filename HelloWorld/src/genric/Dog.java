package genric;

public class Dog extends Animals {

    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
