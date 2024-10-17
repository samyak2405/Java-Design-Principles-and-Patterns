package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        String message = "product is in stock hurry up!";
        sendMail(emailId, message);
    }

    private void sendMail(String emailId, String message) {
        System.out.println("mail sent to: "+emailId);
        System.out.println("message: "+message);
    }
}
