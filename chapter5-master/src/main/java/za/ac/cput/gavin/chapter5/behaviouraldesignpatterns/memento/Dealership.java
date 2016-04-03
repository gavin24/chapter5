package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.memento;


public class Dealership {

    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car car() {
        return new Car(manufacturer);
    }

    public void getCar(Car car) {
        manufacturer = car.getManufacturer();
    }
}
