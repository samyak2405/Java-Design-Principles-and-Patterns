package org.javahunter;

public class Order {
    private Customer customer;
    private double totalPrice;

    public Order(Customer customer,double totalPrice){
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public double calculateFinalPrice(){
        double discount = customer.calculateDiscount(totalPrice);
        return totalPrice-discount;
    }
    public String getOrderDetails(){
        return "Customer: "+customer.getName()+"\nTotal Price: "+totalPrice+"\nFinal Price: Rs."+calculateFinalPrice();
    }
}
