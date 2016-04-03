package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.command;


public class WalkCommand implements Command {

    Walk walk;

    public WalkCommand(Walk walk) {
        this.walk = walk;
    }

    @Override
    public String command() {
        return walk.walk();
    }


}
