package example.decorator;

public abstract class NotificationDecorator implements Notifier {
    private Notifier notifier;


    public NotificationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String notification() {
        return notifier.notification();
    }
}
