package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.abstractfactory.AbstractFactory;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.abstractfactory.Machine;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.abstractfactory.TransportFactory;


public class testAbstractFactory {
    AbstractFactory abstractFactory = null;

    TransportFactory transportFactory1 = null;
    Machine machine1 = null;

    TransportFactory transportFactory2 = null;
    Machine machine2 = null;


    @Before
    public void setUp() {
        abstractFactory = new AbstractFactory();

        transportFactory1 = abstractFactory.getTransportFactory("Land");
        machine1 = transportFactory1.getMachine("Car");

        transportFactory2 = abstractFactory.getTransportFactory("Air");
        machine2 = transportFactory2.getMachine("Aeroplane");
    }

    @Test
    public void testMachine1() {
        Assert.assertEquals("Driving", machine1.move());
    }

    @Test
    public void testMachine2() {
        Assert.assertEquals("Flying", machine2.move());
    }
}
