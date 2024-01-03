package implementations;

import interfaces.PhysicalProduct;

public class Book implements PhysicalProduct {

    private String name;
    private double price;
    private int weight;
    private String shippingAddress;

    public Book(String name, double price, int weight, String shippingAddress) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.shippingAddress = shippingAddress;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
