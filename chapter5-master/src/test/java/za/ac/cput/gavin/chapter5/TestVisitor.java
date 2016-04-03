package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor.Body;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor.BodyPart;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.visitor.MovePart;


public class TestVisitor {
    private BodyPart body = null;

    @Before
    public void setUp() {
        body = new Body();
        body.move(new MovePart());
    }

    @Test
    public void test() {
        Assert.assertEquals(true, body.move(new MovePart()).equalsIgnoreCase("Moving arms Moving legs Moving body "));
    }
}
