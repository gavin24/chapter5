package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor;


public class MovePart implements BodyMovement {

    @Override
    public String movePart(Body body) {
        return "Moving body ";
    }

    @Override
    public String movePart(Arms arms) {
        return "Moving arms ";
    }

    @Override
    public String movePart(Legs legs) {
        return "Moving legs ";
    }
}
