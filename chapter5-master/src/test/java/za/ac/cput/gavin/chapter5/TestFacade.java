package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.facade.DrawShape;


public class TestFacade {

    private DrawShape drawShape = null;

    @Before
    public void setUp() {
        drawShape = new DrawShape();
    }

    @Test
    public void drawRectangle() {
        Assert.assertEquals(true, drawShape.drawRectangle().equalsIgnoreCase("Draw Rectangle"));
    }

    @Test
    public void drawSquare() {
        Assert.assertEquals(true, drawShape.drawSquare().equalsIgnoreCase("Draw Square"));
    }
}
