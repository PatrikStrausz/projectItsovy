package sk.itsovy.strausz.project.itsovy;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student patrik = new Student("Patrik", "Strausz", 17,1,2000   );
        Student zuzana = new Student("Zuzana", "Had", 12,8,1996);
        Student erik = new Student("Erik", "Pes",  5,6,1980);
        Student alica = new Student("Alica","Usata", 18,12,1998);
        Group g1 = new Group("1N", 5);
        g1.addStudent(patrik);
        g1.addStudent(zuzana);
        g1.addStudent(erik);
        g1.addStudent(alica);



       g1.print();




    }
}
