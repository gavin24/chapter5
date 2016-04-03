package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.observer;


public interface Class {

    public abstract boolean addStudent(Lecturer lecturer);
    public abstract boolean removeStudent(Lecturer lecturer);
    public abstract String announce();
}
