package za.ac.cput.gavin.chapter5.creationaldesignpatterns.abstractfactory;


public class AirFactory extends TransportFactory {

    public Machine getMachine(String type) {
        return new Aeroplane();
    }
}
