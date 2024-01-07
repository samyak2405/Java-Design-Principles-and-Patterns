
interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
    }
}