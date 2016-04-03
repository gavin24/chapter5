package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.state;


public class Danger implements Action {

    @Override
    public String move() {
        return "RUN!";
    }
}
