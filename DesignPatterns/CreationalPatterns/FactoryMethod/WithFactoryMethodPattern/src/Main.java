
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
        System.out.println("Motorcycle is starting");
    }
}

interface VehicleFactory{
    Vehicle createVehicle();
}

class CarFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
class MotorcycleFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.start();
    }
}