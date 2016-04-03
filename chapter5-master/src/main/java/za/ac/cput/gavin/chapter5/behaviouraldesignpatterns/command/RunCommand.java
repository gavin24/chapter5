package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.command;

public class RunCommand implements Command {

    Run run;

    public RunCommand(Run run) {
        this.run = run;
    }

    @Override
    public String command() {
        return run.run();
    }
}
