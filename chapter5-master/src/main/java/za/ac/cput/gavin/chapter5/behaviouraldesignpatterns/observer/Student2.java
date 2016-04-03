package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.observer;


public class Student2 implements Lecturer {

    @Override
    public String announce(String msg) {
        return "Student2: " + msg + "\n";
    }
}
