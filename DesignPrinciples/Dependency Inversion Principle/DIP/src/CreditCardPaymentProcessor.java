class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs."+amount);
    }
}
