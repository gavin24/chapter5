package za.ac.cput.gavin.chapter5.creationaldesignpatterns.Singleton;


public class Dog {

    private static Dog dog = null;

    private Dog(){

    }

    public static Dog getInstance(){
        if(dog == null)
        {
            dog = new Dog();
        }
        return dog;
    }

    public String bark(){
        return "Barking";
    }
}
