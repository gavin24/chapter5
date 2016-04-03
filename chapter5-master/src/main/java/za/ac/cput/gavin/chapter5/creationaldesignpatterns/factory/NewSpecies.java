package za.ac.cput.gavin.chapter5.creationaldesignpatterns.factory;


public class NewSpecies {

    public Species getSpecies(String type){
        if(type.equalsIgnoreCase("Human")){
            return new Human();
        } else {
            return new Fish();
        }
    }
}
