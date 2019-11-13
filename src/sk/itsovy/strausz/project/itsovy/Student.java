package sk.itsovy.strausz.project.itsovy;


import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public Student(String firstName, String lastName, int day ,int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day=day;
        this.month=month;
        this.year=year;

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

// Calendar cal = Calendar.getInstance();
//        int month = cal.get(Calendar.MONTH);
//        return month;
    }

    public int getBirthYear() {
        return year;
//
//        Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        return year;
    }

    public int getAge() {
//       int currentYear =  Calendar.getInstance().get(Calendar.YEAR);
//        int year = currentYear - this.year;
//
//        int currentMonth=Calendar.getInstance().get(Calendar.MONTH)+1;
//        int month= currentMonth - this.month;

        return 1;
    }


    public String toString() {
        return getFullName() + " " + "\n"+ "Born: "+ day + "." + month + "." + year+ "\n";

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
