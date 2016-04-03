package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.memento;

import java.util.ArrayList;
import java.util.List;


public class Dealer {
    private List<Car> carList = new ArrayList<Car>();

    public void add(Car car) {
        carList.add(car);
    }

    public Car getCar(int index) {
        return carList.get(index);
    }
}
