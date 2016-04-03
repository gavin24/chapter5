package za.ac.cput.gavin.chapter5.structuraldesignpatterns.flyweight;

public class PersonWalk implements Person {

    String move;

    public PersonWalk() {
        move = "Walk";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String move() {
        return "Person: " + move;
    }
}
