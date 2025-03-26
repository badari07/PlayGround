package genric;

public class Animals {

    public void eat() {
        System.out.println("Animals are eating");
    }

    Animals(){
        System.out.println("Animals constructor");
    }

    @Override
    public String toString() {
        return "Animals{}";
    }
}

