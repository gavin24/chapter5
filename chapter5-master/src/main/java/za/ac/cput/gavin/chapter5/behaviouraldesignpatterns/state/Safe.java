package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.state;


public class Safe implements Action {

    @Override
    public String move() {
        return "Walk";
    }
}
