package org.javahunter;

public class RegularCustomer implements Customer{

    private String name;

    public RegularCustomer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateDiscount(double totalPrice) {
        return 0.05*totalPrice;
    }
}
