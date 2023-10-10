package OOPS;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student kunal = new Student();
        Student rahul = new Student(13,"Rahul", 89.2f);

//        kunal.rno = 12;
//        kunal.name = "Ajay";
//        kunal.marks = 78.4f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);


        System.out.println(rahul.name);
        System.out.println(rahul.rno);
        System.out.println(rahul.marks);

    }

}
class Student{
    int rno;
    String name;
    float marks;

    Student (){
        this.rno = 12;
        this.name = "Ajay";
        this.marks = 85.4f;
    }

    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}

