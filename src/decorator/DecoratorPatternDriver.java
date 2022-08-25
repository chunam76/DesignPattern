package decorator;


public class DecoratorPatternDriver {

    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTreeImpl();

        tree = new Garland(tree);
        System.out.println(tree.decorate());
        tree = new BubbleLights(tree);
        System.out.println(tree.decorate());
        tree = new Garland(tree);
        System.out.println(tree.decorate());
    }
}
