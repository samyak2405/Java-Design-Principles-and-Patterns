public class PaypalPaymentProcessor implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of Rs."+amount);
    }
}
