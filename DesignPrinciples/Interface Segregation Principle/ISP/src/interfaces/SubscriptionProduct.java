package interfaces;

public interface SubscriptionProduct extends Product{
    int getSubscriptionDuration();
    boolean isAutoRenewable();
}
