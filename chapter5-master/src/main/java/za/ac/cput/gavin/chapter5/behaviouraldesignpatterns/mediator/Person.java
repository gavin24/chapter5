package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.mediator;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return Speak.hello(name);
    }

    public String sayGoodbye() {
        return Speak.goodbye(name);
    }
}
