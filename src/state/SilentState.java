package state;

public class SilentState implements AlertState {
    @Override
    public void alert() {
        System.out.println("무음");
    }

    @Override
    public AlertState nextState() {
        return new BellState();
    }
}
