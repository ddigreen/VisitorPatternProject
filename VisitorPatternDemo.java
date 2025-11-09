// Client (Demo)
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Element circle = new Circle(5);
        Element rectangle = new Rectangle(4, 6);

        Visitor areaCalculator = new AreaCalculator();

        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);
    }
}
