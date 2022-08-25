package state;

public interface AlertState {
    public void alert();
    public AlertState nextState();
}
