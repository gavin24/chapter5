package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.mediator.Person;


public class TestMediator {
    private Person person1 = null;
    private Person person2 = null;

    @Before
    public void setUp() {
        person1 = new Person("Gavin");
        person2 = new Person("Ackerman");
    }

    @Test
    public void testPerson1Hello() {
        Assert.assertEquals(true, person1.sayHello().equalsIgnoreCase("Hello Gavin"));
    }

    @Test
    public void testPerson1Goodbye() {
        Assert.assertEquals(true, person1.sayGoodbye().equalsIgnoreCase("Goodbye Gavin"));
    }

    @Test
    public void testPerson2Hello() {
        Assert.assertEquals(true, person2.sayHello().equalsIgnoreCase("Hello Gavin"));
    }

    @Test
    public void testPerson2Goodbye() {
        Assert.assertEquals(true, person2.sayGoodbye().equalsIgnoreCase("Goodbye Gavin"));
    }
}
