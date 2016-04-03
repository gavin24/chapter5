package za.ac.cput.gavin.chapter5.structuraldesignpatterns.adapter;


public interface WeightDetails {

    public abstract  int getWeightInLbs();
    public abstract void setWeightInLbs(int weightInLbs);
    public abstract int getWeightInKg();
    public abstract void setWeightInKg(int weightInKg);
}
