package example.test.Waffle.WaffleDecorator;

import example.test.Waffle.Waffle;

public class Kiwi extends FruitDecorator {
    Waffle waffle;

    public Kiwi(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 0.85 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Kiwi";
    }
}
