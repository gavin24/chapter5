package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.Singleton.Dog;

public class TestSingleton {
    private Dog dog1 = null;
    private Dog dog2 = null;
    private Dog dog3 = null;

    @Before
    public void setUp() throws Exception{
        dog1 = Dog.getInstance();
        dog2 = Dog.getInstance();
    }

    @Test
    public void testBark() throws Exception{
        Assert.assertEquals("Barking", dog1.bark());
    }

    @Test
    public void testInstance() throws Exception{
        Assert.assertEquals(dog1, dog2);
    }
}
