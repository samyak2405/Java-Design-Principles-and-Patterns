public class FixedAmountDiscount extends Discount{

    private double amount;

    public FixedAmountDiscount(double amount){
        this.amount =amount;
    }
    @Override
    double apply(double originalPrice) {
        return originalPrice-amount;
    }
}
