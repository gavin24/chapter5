package za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.observer;

import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class School implements Class {

    Set<Lecturer> lecturerSet;
    String msg;

    public int size() {
        return lecturerSet.size();
    }

    public School(String msg) {
        lecturerSet = new HashSet<Lecturer>();
        this.msg = msg;
    }

    @Override
    public boolean addStudent(Lecturer lecturer) {
        return lecturerSet.add(lecturer);
    }

    @Override
    public boolean removeStudent(Lecturer lecturer) {
        return lecturerSet.remove(lecturer);
    }

    @Override
    public String announce() {
        Iterator<Lecturer> iterator = lecturerSet.iterator();
        String str = "";
        while(iterator.hasNext()) {
            Lecturer lecturer = iterator.next();
            str += lecturer.announce(msg);
        }
        return str;
    }

    public String setMsg(String msg) {
        this.msg = msg;
        return "School: " + msg + "\n" + announce();
    }
}

class my {
    public static void main(String [] args) {
        School school = null;
        Student1 student1 = null;
        Student2 student2 = null;

        school = new School("No classes today");
        student1 = new Student1();
        student2 = new Student2();
        school.addStudent(student1);
        school.addStudent(student2);
        System.out.println(school.setMsg("No classes today"));
    }
}
