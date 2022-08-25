package visitor;

public class NameVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with name: " + xe.getName());
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element with name: " + je.getName());
    }

    @Override
    public void visit(HtmlElement he) {
        System.out.println("processing html element with name: " + he.getName());
    }
}