package sk.itsovy.strausz.project.itsovy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private String[] subjects;
    private int countOfSubjects;


    public Student(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.subjects = new String[10];
        this.countOfSubjects = 0;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDate() {
        return 0;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getBirthDay() {
        return day;

    }

    public int getBirthMonth() {

        return month;

    }

    public int getBirthYear() {
        return year;

    }

    public String[] getSubject() {
        return subjects;
    }

    public static int getAge() {

        return 1;
    }

    public boolean addSubject(String subject) {

        if (subject == null || subject == "") {
            return false;
        }
        boolean find = false;
        for (int i = 0; i < countOfSubjects; i++) {
            if (subjects[i].compareToIgnoreCase(subject) == 0) {
                find = true;
                break;
            }
        }
        if (find == false && countOfSubjects <10) {
            subjects[countOfSubjects] = subject.toUpperCase();
            countOfSubjects++;
            return true;
        } else
            return false;

    }

public void printSubject(){
    System.out.println("Student " +firstName + " " + lastName + " attends: ");
    for(int i=0;i<countOfSubjects; i++){
        System.out.println(" - "+subjects[i]);
    }
}




    public String toString() {
        return getFullName() + " " + "\n"+ "Born: "+ day + "." + month + "." + year;

    }


//    public String getZodiacSign() {

//        int day = getBirthDay();
//        int month = getBirthMonth();
//
//        switch (month) {
//
//            case 1:
//                if (day >= 1 && day <= 20) {
//
//
//                    return "Capricorn";
//                }
//
//                if (day >= 21 && day <= 31) {
//                    return "Aquarius";
//                }
//                break;
//
//
//            case 2:
//                if (day >= 20 && day <= 28) {
//
//
//                    return "Pisces";
//                }
//
//                if (day <= 19 && day >= 1) {
//                    return "Aguarius";
//                }
//                break;
//
//
//            case 3:
//                if (day >= 21 && day <= 31) {
//
//
//                    return "Aries";
//                }
//                if (day >= 1 && day <= 20)
//                    return "Pisces";
//                break;
//
//
//            case 4:
//                if (day >= 1 && day <= 20) {
//
//
//                    return "Aries";
//                }
//                if (day >= 21 && day <= 30) {
//                    return "Taurus";
//                }
//                break;
//
//
//            case 5:
//                if (day >= 1 && day <= 21) {
//
//
//                    return "Taurus";
//                }
//                if (day >= 22 && day <= 31) {
//
//
//                    return "Gemini";
//                }
//                break;
//
//
//            case 6:
//                if (day >= 1 && day <= 21) {
//                    return "Gemini";
//                }
//                if (day >= 22 && day <= 30) {
//                    return "Cancer";
//                }
//                break;
//
//
//            case 7:
//                if (day >= 1 && day <= 22) {
//                    return "Cancer";
//                }
//                if (day >= 23 && day <= 31) {
//                    return " Leo";
//                }
//                break;
//
//            case 8:
//                if (day >= 1 && day <= 23) {
//                    return "Leo";
//                }
//                if (day >= 24 && day <= 31) {
//                    return "Virgo";
//                }
//                break;
//
//            case 9:
//                if (day >= 1 && day <= 23) {
//                    return "Virgo";
//                }
//                if (day >= 24 && day <= 30) {
//                    return "Libra";
//                }
//                break;
//
//            case 10:
//                if (day >= 1 && day <= 23) {
//                    return "Libra";
//                }
//                if (day >= 24 && day <= 31) {
//                    return "Scorpio";
//                }
//                break;
//
//            case 11:
//                if (day >= 1 && day <= 22) {
//                    return "Scorpio";
//                }
//                if (day >= 23 && day <= 30) {
//                    return "Sagittarius";
//                }
//                break;
//
//            case 12:
//                if (day >= 1 && day <= 21) {
//                    return "Sagittarius";
//                }
//                if (day >= 22 && day <= 31) {
//                    return "Capricorn";
//                }
//                break;
//
//            default:
//
//                return "Invalid value";
//
//        }
//  }

}
