package example.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor visitor);
}
