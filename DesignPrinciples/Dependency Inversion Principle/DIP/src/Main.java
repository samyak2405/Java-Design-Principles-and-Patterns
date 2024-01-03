public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentProcessor paypalProcessor = new PaypalPaymentProcessor();

        Order order1 = new Order(creditCardProcessor);
        Order order2 = new Order(paypalProcessor);

        order1.placeOrder(50.0);
        order2.placeOrder(100.0);
    }
}