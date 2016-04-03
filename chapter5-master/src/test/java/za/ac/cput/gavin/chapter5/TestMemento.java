package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.memento.Dealer;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.memento.Dealership;


public class TestMemento {

    private Dealership dealership = null;
    private Dealer dealer = null;

    @Before
    public void setUp() {
        dealership = new Dealership();
        dealer = new Dealer();
    }

    @Test
    public void testDealershipAdd() {
        dealership.setManufacturer("Porche");
        dealer.add(dealership.car());
        Assert.assertEquals(true, dealership.getManufacturer().equalsIgnoreCase("Porche"));
    }

    @Test
    public void test() {
        dealership.setManufacturer("Toyota");
        dealer.add(dealership.car());
        dealership.getCar(dealer.getCar(0));
        Assert.assertEquals(true, dealership.getManufacturer().equalsIgnoreCase("Toyota"));
    }

}
