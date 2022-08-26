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
        System.out.println("�������� ����մϴ�");
        value -= 1;
        return preFix.execute() + " / " + item.getAction()  + " / " +
                 postFix.getAction() + "(" + value + ")";
    }

    public void create(Component preFix) {
        System.out.println("�������� �����մϴ�");
        this.preFix = preFix;
        System.out.println(preFix.execute() + " " + item.getName()  + " " +
                "(" + postFix.getName() + ")" + "����!"  + " (" + value + ")");
    }

    public void replace(Component preFix) {
        this.preFix = preFix;
        System.out.println("�������� ������ ��ü�մϴ�");
        System.out.println(preFix.execute() + " " + item.getName()  + " " +
                "(" + postFix.getName() + ")" + "����! "  + "(" + value + ")");
    }
}
