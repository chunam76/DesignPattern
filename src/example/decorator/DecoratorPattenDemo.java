package example.decorator;

public class DecoratorPattenDemo {
    public static void main(String[] args) {
        Notifier notifier = new NotifierImpl();

        notifier = new EmailNotification(notifier);
        System.out.println(notifier.notification());
        notifier = new SMSNotification(notifier);
        System.out.println(notifier.notification());
        notifier = new KakaoTalkNotification(notifier);
        System.out.println(notifier.notification());
    }
}
