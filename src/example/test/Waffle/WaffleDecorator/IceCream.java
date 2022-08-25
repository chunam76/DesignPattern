package example.test.Waffle.WaffleDecorator;

import example.test.Waffle.Waffle;

public class IceCream extends CondimentDecorator {
    Waffle waffle;

    public IceCream(Waffle waffle){
        this.waffle = waffle;
    }

    @Override
    public double cost() {
        return 2.5 + waffle.cost();
    }

    @Override
    public String getDescription() {
        return waffle.getDescription() + ", Ice Cream";
    }
}
