package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.factory.NewSpecies;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.factory.Species;


public class TestFactory {
    NewSpecies createSpecies = null;
    Species species1 = null;
    Species species2 = null;

    @Before
    public void setUp(){
        createSpecies = new NewSpecies();
        species1 = createSpecies.getSpecies("Human");
        species2 = createSpecies.getSpecies("Fish");
    }

    @Test
    public void testSpecies1Move(){
        Assert.assertEquals("Walk", species1.move());
    }

    @Test
    public void testSpecies2Move(){
        Assert.assertEquals("Swim", species2.move());
    }

    @Test
    public void testObjectsEquality(){
        Assert.assertEquals(false, species1.equals(species2));
    }
}
