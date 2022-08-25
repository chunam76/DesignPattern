package example.decorator;

import decorator.ChristmasTree;

public class EmailNotification extends NotificationDecorator {

    public EmailNotification(Notifier notifier) {
        super(notifier);
    }

    public String notification() {
        return super.notification() + decorate();
    }

    private String decorate() {
        return " with Email";
    }
}
