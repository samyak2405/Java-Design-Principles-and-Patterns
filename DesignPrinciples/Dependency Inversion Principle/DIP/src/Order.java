public class Order {
    private PaymentProcessor processor;

    public Order(PaymentProcessor paymentProcessor){
        this.processor =paymentProcessor;
    }

    public void placeOrder(double amount){
        System.out.println("Order placed with total amount: Rs."+amount);
        processor.processPayment(amount);
        System.out.println("Order processed successfully");
    }
}
