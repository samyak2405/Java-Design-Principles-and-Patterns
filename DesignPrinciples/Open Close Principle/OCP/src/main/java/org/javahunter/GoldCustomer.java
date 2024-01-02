package org.javahunter;

public class GoldCustomer implements Customer{

    private String name;

    public GoldCustomer(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateDiscount(double totalPrice) {
        return 0.15*totalPrice;
    }
}
