package za.ac.cput.gavin.chapter5.creationaldesignpatterns.builder;

public class ItalianPizza implements PizzaBuilder {

    private Pizza pizza;

    public ItalianPizza() {
        pizza = new Pizza();
    }

    @Override
    public void topping1() {
        pizza.setTopping1("Peperoni");
    }

    @Override
    public void topping2() {
        pizza.setTopping2("Cheese");
    }

    @Override
    public void topping3() {
        pizza.setTopping3("Tomato");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
