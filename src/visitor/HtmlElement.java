package visitor;

public class HtmlElement extends Element {

    public HtmlElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}