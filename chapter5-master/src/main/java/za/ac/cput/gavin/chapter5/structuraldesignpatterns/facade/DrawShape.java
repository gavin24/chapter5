package za.ac.cput.gavin.chapter5.structuraldesignpatterns.facade;


public class DrawShape {

    private Shape rectangle;
    private Shape square;

    public DrawShape() {
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}
