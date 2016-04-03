package za.ac.cput.gavin.chapter5.structuraldesignpatterns.bridge;


public abstract class Shape {

    protected Draw draw;

    protected Shape(Draw draw) {
        this.draw = draw;
    }

    public abstract String draw();
}
