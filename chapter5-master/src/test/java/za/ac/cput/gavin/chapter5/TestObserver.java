package za.ac.cput.gavin.chapter5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.observer.School;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.observer.Student1;
import za.ac.cput.gavin.chapter5.behaviouraldesignpatterns.observer.Student2;

public class TestObserver {

    private School school = null;
    private Student1 student1 = null;
    private Student2 student2 = null;

    @Before
    public void setUp() {
        school = new School("No classes today");
        student1 = new Student1();
        student2 = new Student2();


        school.removeStudent(student1);
        school.setMsg("Class today");
    }

    @Test
    public void testAddStudent() {
        Assert.assertEquals(true, school.addStudent(student1));
    }

    @Test
    public void testSetMsgAndAnnounce() {
        school.addStudent(student1);
        school.addStudent(student2);
        Assert.assertEquals(true, school.setMsg("No classes today").equalsIgnoreCase("School: No classes today" + "\n" + "Student1: No classes today" + "\n" + "Student2: No classes today" + "\n"));
        school.removeStudent(student1);
        Assert.assertEquals(true, school.setMsg("No classes today").equalsIgnoreCase("School: No classes today" + "\n" + "Student2: No classes today" + "\n"));
    }

    @Test
    public void testRemove() {
        school.addStudent(student1);
        school.addStudent(student2);
        Assert.assertEquals(true, school.removeStudent(student1));
    }
}
