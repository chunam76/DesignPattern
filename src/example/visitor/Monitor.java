package example.visitor;

public class Monitor implements ComputerPart{

    public Monitor() {
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
