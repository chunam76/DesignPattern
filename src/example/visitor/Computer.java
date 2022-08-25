package example.visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart{

    List<ComputerPart> parts = new ArrayList<>();

    public Computer() {
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart e : this.parts) {
            e.accept(visitor);
        }
    }
}
