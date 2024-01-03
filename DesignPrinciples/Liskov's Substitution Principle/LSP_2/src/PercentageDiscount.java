public class PercentageDiscount extends Discount{

    private double percentage;
    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }
    @Override
    double apply(double originalPrice) {
        return originalPrice-(percentage/100)*originalPrice;
    }
}
