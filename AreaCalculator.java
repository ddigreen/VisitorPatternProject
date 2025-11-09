// Concrete Visitor: AreaCalculator
public class AreaCalculator implements Visitor {
    private double area;

    @Override
    public void visit(Circle circle) {
        area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }
}
