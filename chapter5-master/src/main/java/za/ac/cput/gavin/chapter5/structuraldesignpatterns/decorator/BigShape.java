package za.ac.cput.gavin.chapter5.structuraldesignpatterns.decorator;


public class BigShape extends DrawShape {

    public BigShape(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return shape.draw() + color(shape);
    }

    private String color(Shape shape) {
        return ": Red";
    }
}
