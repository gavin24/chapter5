package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.state;

public class Person implements Action {

    Action action;

    public Person(Action action) {
        this.action = action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String move() {
        return action.move();
    }
}
