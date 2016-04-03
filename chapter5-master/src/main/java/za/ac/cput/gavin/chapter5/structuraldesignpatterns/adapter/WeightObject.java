package za.ac.cput.gavin.chapter5.structuraldesignpatterns.adapter;


public class WeightObject implements WeightDetails {

    Weight weight = null;

    public WeightObject(){
        weight = new Weight();
    }

    @Override
    public int getWeightInLbs() {
        return toLbs(weight.getWeight());
    }

    @Override
    public void setWeightInLbs(int weightInLbs) {
        weight.setWeight(toKg(weightInLbs));
    }

    @Override
    public int getWeightInKg() {
        return weight.getWeight();
    }

    @Override
    public void setWeightInKg(int weightInKg) {
        weight.setWeight(weightInKg);
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
