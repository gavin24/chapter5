package za.ac.cput.gavin.chapter5.structuraldesignpatterns.composite;


public class Vehicle implements Component {

    String car;

    public Vehicle(String car) {
        this.car = car;
    }

    @Override
    public String accelerate() {
        return car + " accelerating";
    }

    @Override
    public String brake() {
        return car + " braking";
    }
}
