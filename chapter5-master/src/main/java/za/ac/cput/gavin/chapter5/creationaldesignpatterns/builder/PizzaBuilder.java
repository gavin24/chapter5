package za.ac.cput.gavin.chapter5.creationaldesignpatterns.builder;


public interface PizzaBuilder {
    public abstract void topping1();
    public abstract void topping2();
    public abstract void topping3();
    public abstract Pizza getPizza();
}
