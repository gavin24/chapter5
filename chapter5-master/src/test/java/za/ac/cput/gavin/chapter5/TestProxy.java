package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.proxy.Image;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.proxy.ProxyImage;


public class TestProxy {

    private Image image1 = null;
    private Image image2 = null;

    @Before
    public void setUp() {
        image1 = new ProxyImage("Image1.jpg");
        image2 = new ProxyImage("Image2.jpg");
    }

    @Test
    public void testProxyImage() {
        Assert.assertEquals(true, image1.display().equalsIgnoreCase("Displaying Image1.jpg"));
    }

    @Test
    public void testRealImage() {
       Assert.assertEquals(true, image2.display().equalsIgnoreCase("Displaying Image2.jpg"));
    }
}
