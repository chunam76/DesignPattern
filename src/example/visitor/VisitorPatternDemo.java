package example.visitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        Computer computer = new Computer();
        computer.parts.add(new Keyboard());
        computer.parts.add(new Monitor());
        computer.parts.add(new Mouse());

        computer.accept(visitor);
    }
}
