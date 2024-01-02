package org.javahunter;

public class Main {
    public static void main(String[] args) {
        Customer regularCustomer = new RegularCustomer("Samyak moon");
        Customer goldCustomer = new GoldCustomer("Vedang Moon");

        Order regularOrder = new Order(regularCustomer,100.00);
        Order goldOrder = new Order(goldCustomer,200.0);

        OrderProcessor.processOrder(regularOrder);
        OrderProcessor.processOrder(goldOrder);
    }
}