package example.decorator;

public class NotifierImpl implements Notifier {
    @Override
    public String notification() {
        return "Notification";
    }
}
