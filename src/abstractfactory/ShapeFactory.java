package abstractfactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if(type.equals("RECTANGLE"))
            return new Rectangle();
        else if(type.equals("SQUARE"))
            return new Square();
        else
            return null;
    }
}
