package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.composite.Vehicle;
import za.ac.cput.gavin.chapter5.structuraldesignpatterns.composite.CarList;


public class TestComposite {

    private Vehicle vehicle1 = null;
    private Vehicle vehicle2 = null;
    private Vehicle vehicle3 = null;
    private Vehicle vehicle4 = null;
    CarList carList1 = null;

    @Before
    public void setUp() {
        vehicle1 = new Vehicle("Porche");
        vehicle2 = new Vehicle("Toyota");
        vehicle3 = new Vehicle("Honda");
        vehicle4 = new Vehicle("Ferrari");

        carList1 = new CarList();
        carList1.add(vehicle1);
        carList1.add(vehicle2);
        carList1.add(vehicle3);
    }

    @Test
    public void testAccelerate() {
        Assert.assertEquals(true, vehicle1.accelerate().equalsIgnoreCase("Porche accelerating"));
        Assert.assertEquals(true, vehicle2.accelerate().equalsIgnoreCase("Toyota accelerating"));
        Assert.assertEquals(true, vehicle3.accelerate().equalsIgnoreCase("Honda accelerating"));
        Assert.assertEquals(true, vehicle4.accelerate().equalsIgnoreCase("Ferrari accelerating"));
    }

    @Test
    public void testBrake() {
        Assert.assertEquals(true, vehicle1.brake().equalsIgnoreCase("Porche braking"));
        Assert.assertEquals(true, vehicle2.brake().equalsIgnoreCase("Toyota braking"));
        Assert.assertEquals(true, vehicle3.brake().equalsIgnoreCase("Honda braking"));
        Assert.assertEquals(true, vehicle4.brake().equalsIgnoreCase("Ferrari braking"));
    }

    @Test
    public void testAddToCarList() {
        carList1.add(vehicle4);
        Assert.assertEquals(true, carList1.getComponents().contains(vehicle4));
    }

    @Test
    public void testRemoveFromCarList() {
        carList1.remove(vehicle2);
        Assert.assertEquals(false, carList1.getComponents().contains(vehicle2));
    }

    @Test
    public void testGetCar() {
        Assert.assertEquals(vehicle1, carList1.getComponent(0));
    }
}
