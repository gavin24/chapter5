package za.ac.cput.gavin.chapter5.structuraldesignpatterns.flyweight;


public class PersonRun implements Person {

    String move;

    public PersonRun() {
        move = "Run";
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String move() {
        return "Person: " + move;
    }
}
