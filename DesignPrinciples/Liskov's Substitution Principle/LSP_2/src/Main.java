public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop",100.0);
        Discount percentageDiscount = new PercentageDiscount(10);
        laptop.applyDiscount(percentageDiscount);
        System.out.println("After 10% discount: Rs."+laptop.getPrice());

        Discount fixedAmountDiscount = new FixedAmountDiscount(50);
        laptop.applyDiscount(fixedAmountDiscount);
        System.out.println("After Rs.50 discount: Rs."+laptop.getPrice());
    }
}