package example.visitor;

public class Keyboard implements ComputerPart{

    public Keyboard() {
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
