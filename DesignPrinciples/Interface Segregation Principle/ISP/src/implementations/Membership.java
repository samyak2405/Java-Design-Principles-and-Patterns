package implementations;

import interfaces.SubscriptionProduct;

public class Membership implements SubscriptionProduct {
    private String name;
    private double price;
    private int subscriptionDuration;
    private boolean autoRenewable;

    public Membership(String name, double price, int subscriptionDuration, boolean autoRenewable) {
        this.name = name;
        this.price = price;
        this.subscriptionDuration = subscriptionDuration;
        this.autoRenewable = autoRenewable;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getSubscriptionDuration() {
        return subscriptionDuration;
    }

    @Override
    public boolean isAutoRenewable() {
        return autoRenewable;
    }
}
