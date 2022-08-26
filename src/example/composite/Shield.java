package example.composite;

public class Shield extends Item {

    @Override
    public String getName() {
        return "방패";
    }

    @Override
    public String getAction() {
        return "방어합니다";
    }
}
