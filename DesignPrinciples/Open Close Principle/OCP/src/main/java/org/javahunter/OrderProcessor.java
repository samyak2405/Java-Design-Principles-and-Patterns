package org.javahunter;

public class OrderProcessor {
    public static void processOrder(Order order){
        System.out.println("Order processed: \n"+order.getOrderDetails());
    }
}
