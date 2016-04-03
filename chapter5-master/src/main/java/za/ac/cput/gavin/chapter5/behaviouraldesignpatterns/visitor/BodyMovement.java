package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor;


public interface BodyMovement {
    public abstract String movePart(Body body);
    public abstract String movePart(Arms arms);
    public abstract String movePart(Legs legs);
}
