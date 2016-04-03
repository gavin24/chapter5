package za.ac.cput.gavin.chapter5.creationaldesignpatterns.builder;


public class PizzaDirector {

    private PizzaBuilder pizzaBuilder = null;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void makePizza() {
        pizzaBuilder.topping1();
        pizzaBuilder.topping2();
        pizzaBuilder.topping3();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
