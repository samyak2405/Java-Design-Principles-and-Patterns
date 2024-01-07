
abstract interface Notification{
    void notifyUser();
}

class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification");
    }
}

class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
class NotificationFactory{
    public Notification createNotification(String channel){
        if (channel==null || channel.isEmpty())
            return null;
        switch (channel){
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown Channel "+channel);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}