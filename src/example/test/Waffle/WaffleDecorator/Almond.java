package example.test.Waffle.WaffleDecorator;

import example.test.Waffle.Waffle;

public class Almond extends CondimentDecorator {
    Waffle waffle;

    public Almond(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 0.35 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Almond";
    }
}
