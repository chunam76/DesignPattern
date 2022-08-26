package example.composite;

public class MaterComponent implements Component{

    Component preFix;

    Item item;
    PostFix postFix;

    int value;

    public MaterComponent(Item item, PostFix postFix) {
        this.item = item;
        this.postFix = postFix;
        this.value = 100;
    }

    @Override
    public String execute() {
        System.out.println("아이템을 사용합니다");
        value -= 1;
        return preFix.execute() + " / " + item.getAction()  + " / " +
                 postFix.getAction() + "(" + value + ")";
    }

    public void create(Component preFix) {
        System.out.println("아이템을 생성합니다");
        this.preFix = preFix;
        System.out.println(preFix.execute() + " " + item.getName()  + " " +
                "(" + postFix.getName() + ")" + "생성!"  + " (" + value + ")");
    }

    public void replace(Component preFix) {
        this.preFix = preFix;
        System.out.println("아이템의 마법을 교체합니다");
        System.out.println(preFix.execute() + " " + item.getName()  + " " +
                "(" + postFix.getName() + ")" + "생성! "  + "(" + value + ")");
    }
}
