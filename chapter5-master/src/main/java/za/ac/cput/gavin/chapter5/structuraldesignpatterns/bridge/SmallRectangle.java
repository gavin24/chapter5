package za.ac.cput.gavin.chapter5.structuraldesignpatterns.bridge;


public class SmallRectangle implements Draw{

    @Override
    public String drawRectangle(int height, int width) {
        return "Height: " + height + " Width: " + width;
    }
}
