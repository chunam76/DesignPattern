package state;

public class VibrationState implements AlertState {
    @Override
    public void alert() {
        System.out.println("진동");
    }

    @Override
    public AlertState nextState() {
        return new SilentState();
    }
}
