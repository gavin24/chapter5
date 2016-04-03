package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor;


public class Arms implements BodyPart {

    @Override
    public String move(BodyMovement bodyMovement) {
        return bodyMovement.movePart(this);
    }
}
