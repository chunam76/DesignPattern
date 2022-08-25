package example.decorator;

public class SMSNotification extends NotificationDecorator {

    public SMSNotification(Notifier notifier) {
        super(notifier);
    }

    public String notification() {
        return super.notification() + decorate();
    }

    private String decorate() {
        return " with SMS";
    }
}
