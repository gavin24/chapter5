package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.adapter.WeightClass;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.adapter.WeightDetails;

import java.text.DecimalFormat;


public class TestAdapter {

    private WeightDetails weightDetails1 = null;
    private WeightDetails weightDetails2 = null;
    DecimalFormat decimalFormat = null;

    @Before
    public void setUp() {

        weightDetails1 = new WeightClass();
        weightDetails2 = new WeightClass();
        decimalFormat = new DecimalFormat("#.00");
    }

    @Test
    public void testWeightDeatails1() {
        weightDetails1.setWeightInKg(60);
        Assert.assertEquals(60, weightDetails1.getWeightInKg());
        Assert.assertEquals(132, weightDetails1.getWeightInLbs());
    }

    @Test
    public void testWeightDeatails2() {
        weightDetails1.setWeightInLbs(200);
        Assert.assertEquals(198, weightDetails1.getWeightInLbs());
        Assert.assertEquals(90, weightDetails1.getWeightInKg());
    }
}
