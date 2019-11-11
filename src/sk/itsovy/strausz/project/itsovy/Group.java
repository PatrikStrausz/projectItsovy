package sk.itsovy.strausz.project.itsovy;

import java.util.Date;

public class Group {

    private String name;
    private int capacity;
    private Student[] arr;
    private  int size;


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

    public String getStudent(String firstName, String lastName){
       return null;

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


}
