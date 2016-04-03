package za.ac.cput.gavin.chapter5.structuraldesignpatterns.facade;


public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Draw Rectangle";
    }
}
