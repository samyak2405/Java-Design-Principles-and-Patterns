package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        String message = "Product is in stock hurry up!";
        sendMsgOnMobile(userName, message);
    }

    private void sendMsgOnMobile(String userName, String message) {
        System.out.println("msg sent to "+userName);
        System.out.println("message is "+message);
    }
}
