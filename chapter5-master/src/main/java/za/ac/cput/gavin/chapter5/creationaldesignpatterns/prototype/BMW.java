package za.ac.cput.gavin.chapter5.creationaldesignpatterns.prototype;


public class BMW implements Prototype{

    private String model;

    public BMW(String model) {
        this.model = model;
    }

    @Override
    public Prototype copy() {
        return new BMW(model);
    }

    public String toString() {
        return "BMW model: " + model;
    }
}
