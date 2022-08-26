package example.composite;

public class GameDemo {

    public static void main(String[] args) {
        Component heal = new Heal();
        Component fire = new Fire();
        MaterComponent masterComponent = new MaterComponent
                (new Shield(), new Light());

        masterComponent.create(heal);
        System.out.println(masterComponent.execute());

        masterComponent.replace(fire);
        System.out.println(masterComponent.execute());

        MaterComponent masterComponent2 = new MaterComponent
                (new Sword(), new Dark());

        masterComponent2.create(heal);
        System.out.println(masterComponent2.execute());

        masterComponent2.replace(fire);
        System.out.println(masterComponent2.execute());
    }
}
