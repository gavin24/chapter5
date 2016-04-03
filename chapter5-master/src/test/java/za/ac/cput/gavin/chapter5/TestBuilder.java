package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.creationaldesignpatterns.builder.*;


public class TestBuilder {

    PizzaBuilder pizzaBuilder1 = null;
    PizzaDirector pizzaDirector1 = null;
    Pizza pizza1 = null;
    PizzaBuilder pizzaBuilder2 = null;
    PizzaDirector pizzaDirector2 = null;
    Pizza pizza2 = null;

    @Before
    public void setUp() {

        //Pizza 1
        pizzaBuilder1 = new ItalianPizza();
        pizzaDirector1 = new PizzaDirector(pizzaBuilder1);
        pizzaDirector1.makePizza();
        pizza1 = pizzaDirector1.getPizza();

        //Pizza 2
        pizzaBuilder2 = new SouthAfricanPizza();
        pizzaDirector2 = new PizzaDirector(pizzaBuilder2);
        pizzaDirector2.makePizza();
        pizza2 = pizzaDirector2.getPizza();
    }

    @Test
    public void testItalianPizza() {
        Assert.assertEquals(pizza1, pizzaDirector1.getPizza());
    }

    @Test
    public void testSouthAfricanPizza() {
        Assert.assertEquals(pizza2, pizzaDirector2.getPizza());
    }

    @Test
    public void testDifferentPizzas() {
        Assert.assertEquals(false, pizzaDirector1.getPizza().equals(pizzaDirector2.getPizza()));
    }

    @Test
    public void testItalianPizzaToppings() {
        Assert.assertEquals("Peperoni", pizza1.getTopping1());
        Assert.assertEquals("Cheese", pizza1.getTopping2());
        Assert.assertEquals("Tomato", pizza1.getTopping3());
    }

    @Test
    public void testSouthAfricanPizzaToppings() {
        Assert.assertEquals("Steak", pizza2.getTopping1());
        Assert.assertEquals("Cheese", pizza2.getTopping2());
        Assert.assertEquals("Gherkins", pizza2.getTopping3());
    }
}
