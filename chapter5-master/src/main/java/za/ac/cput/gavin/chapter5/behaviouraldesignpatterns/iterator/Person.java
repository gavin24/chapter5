package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.iterator;


public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " +  age;
    }
}
