package example.composite;

public class Heal implements Component{
    @Override
    public String execute() {
        return "치유하는";
    }
}
