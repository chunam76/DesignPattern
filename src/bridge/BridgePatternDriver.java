package bridge;

public class BridgePatternDriver {

    public static void main(String[] args) {

        //클라리언트가 Square, Triangle를 직접 접근하는 것보다는 Factory나 Builder를 사용하는 것도 좋다.
        Shape square = new Square(new Red());
        System.out.println(square.draw());
        
        //a triangle with blue color
        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());
    }
}
