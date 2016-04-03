package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.prototype.BMW;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.prototype.Porche;


public class TestPrototype {

    BMW bmw1 = null;
    BMW bmw2 = null;
    Porche porche1 = null;
    Porche porche2 = null;

    @Before
    public void setUp() {
        bmw1 = new BMW("i8");
        bmw2 = (BMW) bmw1.copy();
        porche1 = new Porche("911");
        porche2 = (Porche) porche1.copy();
    }

    @Test
    public void testBWM() {
        Assert.assertEquals(false, bmw1.equals(bmw2));
    }

    @Test
    public void testBMWOutput() {
        Assert.assertEquals(bmw2.toString(), bmw1.toString());
    }

    @Test
    public void testPorche() {
        Assert.assertEquals(false, porche1.equals(porche2));
    }

    @Test
    public void testPorcheOutput() {
        Assert.assertEquals(porche2.toString(), porche1.toString());
    }
}
