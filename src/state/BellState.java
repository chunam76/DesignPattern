package state;

public class BellState implements AlertState {
    @Override
    public void alert() {
        System.out.println("벨");
    }

    @Override
    public AlertState nextState() {
        return new VibrationState();
    }
}
