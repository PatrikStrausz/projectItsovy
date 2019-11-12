package sk.itsovy.strausz.project.itsovy;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student Patrik = new Student("Patrik", "Strausz", new Date());
        Student ka = new Student("Karin", "Had", new Date());
        Student ka2 = new Student("Erik", "Pes", new Date());
        Student a = new Student("Alica","Aalica", new Date());
        Group g1 = new Group("1N", 5);
        g1.addStudent(Patrik);
        g1.addStudent(ka);
        g1.addStudent(ka2);
        g1.addStudent(a);
        g1.print();


       g1.print();
        System.out.println(g1.randomStudent());



    }
}
