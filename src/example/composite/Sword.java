package example.composite;

public class Sword extends Item {

    @Override
    public String getName() {
        return "칼";
    }

    @Override
    public String getAction() {
        return "공격합니다";
    }
}
