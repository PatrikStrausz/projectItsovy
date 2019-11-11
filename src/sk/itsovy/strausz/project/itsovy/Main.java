package sk.itsovy.strausz.project.itsovy;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student Patrik= new Student("Patrik","Strausz", new Date());
        Student ka= new Student("sa", "sa", new Date());
        Group g1 = new Group("1N",5);
 g1.addStudent(Patrik);
 g1.addStudent(ka);
 g1.deleteStudent(ka);
        g1.print();

    }
}
