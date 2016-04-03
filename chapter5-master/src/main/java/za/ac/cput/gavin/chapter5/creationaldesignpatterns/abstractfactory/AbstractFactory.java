package za.ac.cput.gavin.chapter5.creationaldesignpatterns.abstractfactory;


public class AbstractFactory {

    public TransportFactory getTransportFactory(String type) {
        if(type.equalsIgnoreCase("Land")) {
            return new LandFactory();
        } else {
            return new AirFactory();
        }
    }
}
