package Generics.comparing;

import jdk.jshell.TypeDeclSnippet;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno,float marks) {
        this.rollno=rollno;
        this.marks=marks;
    }

    public static void main(String[] args) {
        Student tanishq = new Student(1,90.4f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {tanishq,rahul,arpit,karan,sachin};
        Arrays.sort(list);//sorting on the basis of marks as i have provided it with marks in compairto
        System.out.println(Arrays.toString(list));


        if(tanishq.compareTo(rahul)<0){
            System.out.println(tanishq.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff  = (int)(this.marks-o.marks);
        //if diff ==0 means both are equal
        // if diff<1 means o os bigger else o is smaller

        return diff;
    }
}
