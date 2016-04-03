package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.templatemethod;


public abstract class Transport {

    public abstract String start();
    public abstract String energySource();

    public final String ride() {

        String str = "Energy source: " + energySource();
        str += ", Start: " + start();
        return str;
    }
}
