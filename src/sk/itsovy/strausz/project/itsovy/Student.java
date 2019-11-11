package sk.itsovy.strausz.project.itsovy;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFullName(){
        return firstName + " " +lastName;
    }

    public int  getBirthDay(){
        return Calendar.MONTH;

    }
//    public  getBirthMonth(){
//        return birthDate.getMonth();
//    }

    public Date getBirthYear(){
        return birthDate;
    }

    public String toString(){
        return getFullName();
    }
}
