package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.command.*;


public class TestCommand {

    private Run run = null;
    private Command runCommand = null;
    private Walk walk = null;
    private Command walkCommand = null;
    private Executer executer1 = null;
    private Executer executer2 = null;

    @Before
    public void setUp() {
        run = new Run();
        runCommand = new RunCommand(run);
        walk = new Walk();
        walkCommand = new WalkCommand(walk);
        executer1 = new Executer(runCommand);
        executer2 = new Executer(walkCommand);
    }

    @Test
    public void testRunCommand() {
        Assert.assertEquals(true, executer1.invokeCommand().equalsIgnoreCase("Running"));
    }

    @Test
    public void testWalkCommand() {
        Assert.assertEquals(true, executer2.invokeCommand().equalsIgnoreCase("Walking"));
    }
}
