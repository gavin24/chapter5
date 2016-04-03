package za.ac.cput.gavin.chapter5.structuraldesignpatterns.proxy;


public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        return realImage.display();
    }
}
