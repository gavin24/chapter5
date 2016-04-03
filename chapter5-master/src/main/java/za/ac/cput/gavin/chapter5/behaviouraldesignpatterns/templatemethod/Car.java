package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.templatemethod;


public class Car extends Transport {

    @Override
    public String start() {
        return "Start car";
    }

    @Override
    public String energySource() {
        return "Petrol";
    }
}
