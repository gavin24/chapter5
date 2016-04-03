package za.ac.cput.gavin.chapter5.structuraldesignpatterns.decorator;

public abstract class DrawShape implements Shape{

    protected Shape shape;

    public DrawShape(Shape shape) {
        this.shape = shape;
    }

    public String draw() {
        return shape.draw();
    }
}
