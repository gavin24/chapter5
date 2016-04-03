package za.ac.cput.gavin.chapter5.structuraldesignpatterns.adapter;


public class WeightClass extends Weight implements WeightDetails{

    @Override
    public int getWeightInLbs() {
        return toLbs(weightInKg);
    }

    @Override
    public void setWeightInLbs(int weightInLbs) {
        this.weightInKg = toKg(weightInLbs);
    }

    @Override
    public int getWeightInKg() {
        return weightInKg;
    }

    @Override
    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    private int toKg(int weightInLbs) {
        double w = weightInLbs * 0.453;
        return (int)w;
    }

    private int toLbs(int weightInKg) {
        double w = weightInKg * 2.204;
        return (int)w;
    }
}
