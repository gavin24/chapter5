package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor;


public class Body implements BodyPart {
    BodyPart[] parts;

    public Body() {
        parts = new BodyPart[] {new Arms(), new Legs()};
    }

    @Override
    public String move(BodyMovement bodyMovement) {
        String str = "";
        for(int i = 0; i < parts.length; i++) {
            str = str + parts[i].move(bodyMovement);
        }
        return str + bodyMovement.movePart(this);
    }
}