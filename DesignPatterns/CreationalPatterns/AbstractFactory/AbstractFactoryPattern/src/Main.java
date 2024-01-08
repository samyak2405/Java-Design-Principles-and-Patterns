public class Main {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.MICRO,Location.INDIA));
        System.out.println(CarFactory.buildCar(CarType.MINI,Location.INDIA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.INDIA));
        System.out.println(CarFactory.buildCar(CarType.MICRO,Location.USA));
        System.out.println(CarFactory.buildCar(CarType.MINI,Location.USA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.USA));
        System.out.println(CarFactory.buildCar(CarType.MICRO,Location.DEFAULT));
        System.out.println(CarFactory.buildCar(CarType.MINI,Location.DEFAULT));
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.DEFAULT));
    }
}