package sk.itsovy.strausz.project.itsovy;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Group  {

    private String name;
    private int capacity;
    private Student[] arr;
    private  int size;
  private String [] subject;


    public Group(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
       this.size=0;
       this.arr= new Student[capacity];
    }

    public boolean addStudent(Student student){
       if(student==null || size==capacity){
           return false;
       }
       arr[size]=student;
       size++;
       return true;


    }

    public String getStudent(String firstName, String lastName) {
        if (size < 0) {
            return null;
        }
        String fullName = null;
        for (int i = 0; i < arr.length; i++) {
            if (firstName.equals(arr[i].getFirstName()) && lastName.equals(arr[i].getLastName())) {
                fullName = firstName + " " + lastName;


            }


        }
        return fullName;

    }

    public boolean deleteStudent(Student student){
        if(student==null || size==0){
            return false;
        }
       int temp=0;
        for(int i=0; i<size;i++){
            if(arr[i]==student){
               temp=i;
            }

        }
        for(int i=temp;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return true;


    }

    public void print(){
        System.out.println("List of students [" +name+ "] : ");
        for(int i=0;i<size;i++){
            System.out.println("   " +arr[i].toString());
        }
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void  sort() {
        int n= size;
        if (size > 0) {

            for (int i = 1; i < n-1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) > 0) {
                        Student temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }
                    if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) == 0) {
                        if (arr[i].getFirstName().compareToIgnoreCase(arr[j].getFirstName()) > 0) {
                            Student temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }

                    }

                }
            }
        }
    }

    public Student randomStudent(){
       int a=0;

        if(size>0) {
            Random rnd= new Random();

                a= rnd.nextInt(size);

       }
       return arr[a];

    }

  public Student[] getStudents(int month){
      if (size == 0 || month <= 0 || month >=13){
          System.out.println("Wrong input");
          System.exit(1);
      }
      int temp=0;
      for (int i=0; i<size; i++){
          if (month == arr[i].getBirthMonth()){
              temp++;
          }
      }
      Student[] students = new Student[temp];
      temp=0;
      for (int i=0; i<size; i++){
          if (month == arr[i].getBirthMonth()){
              students[temp]=arr[i];
              temp++;
          }
      }
      return students;
  }


//     public boolean getStudentsBySubject(String subject){
//    if(subject==null || size==0){
//            return false;
//        }
//
//     }
}

