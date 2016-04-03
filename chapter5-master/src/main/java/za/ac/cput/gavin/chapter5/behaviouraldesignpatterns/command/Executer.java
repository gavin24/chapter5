package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.command;

public class Executer {

    Command command;

    public Executer(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String invokeCommand() {
        return command.command();
    }
}
