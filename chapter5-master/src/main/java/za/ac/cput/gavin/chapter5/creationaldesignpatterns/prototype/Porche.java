package za.ac.cput.gavin.chapter5.creationaldesignpatterns.prototype;


public class Porche implements Prototype {

    private String model;

    public Porche(String model) {
        this.model = model;
    }

    @Override
    public Prototype copy() {
        return new Porche(model);
    }

    public String toString() {
        return "Porche model: " + model;
    }
}
