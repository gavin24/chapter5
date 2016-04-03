package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.templatemethod;


public class Train extends Transport {

    @Override
    public String start() {
        return "Turbines on";
    }

    @Override
    public String energySource() {
        return "Coal";
    }
}
