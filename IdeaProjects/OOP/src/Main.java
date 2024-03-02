public class Main {
    public static void main(String[] args) {
        Student[] students= new Student[5];

        //just declaring
        Student tanishq;
//        tanishq.rno=2;
//        tanishq.name="Tanishq";
//        tanishq.marks=90.4f;
        //can declare like this to
//        tanishq=new Student(2,"Tanishq",90.4f);
//        tanishq.greeting();
//        tanishq.changname("Tony");
//        System.out.println(tanishq.name);
//        System.out.println(tanishq.name);

    }
}
//creating a class for every stundent
//our own data type
class Student{
    int rno;
    String name;
    float marks = 85;//setting default value , if nothing is entered it will print this value
    //a method greeting that prints a greeting
    void greeting (){
        System.out.println("hello my name is "+ this.name);
    }
    //another method 'change name'
    void changname(String naam){
        this.name= naam;//changes the name of 'this' student to naam entered by user
    }
//    Student (){
//        this.name ="default";
//        this.rno= 95;
//        this.marks= 50.0f;
//    }


    Student (Student other ){
        this.name = other.name;
        this.rno= other.rno;
        this.marks= other.marks;
    }

    //calling a constructor from another constructor
//    Student(){
//        this (13,"default",90.0f);
//        //internally : new Student (13,"default",90.0f);
//    }

    //Student x = new Student(17,"xyz",76.8f);
    //here 'this ' will be replaced by x
    Student (int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}