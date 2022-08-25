package example.decorator;

public class KakaoTalkNotification extends NotificationDecorator {

    public KakaoTalkNotification(Notifier notifier) {
        super(notifier);
    }

    public String notification() {
        return super.notification() + decorate();
    }

    private String decorate() {
        return " with Kakao Talk";
    }
}
