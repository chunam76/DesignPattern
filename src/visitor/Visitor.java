package visitor;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);

    void visit(HtmlElement he);
}
