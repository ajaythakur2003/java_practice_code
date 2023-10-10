package OOPS.staticExample;


// The static keyword in java is used for memory management.
//The static keyword belongs to the class than an instance variable.
//The static can be variables, methods, blocks and nested classes.
//static variable can be used to refer to the common property of all objects.


public class StaticExample2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ajay Thakur", 3127);
        Student s2 = new Student("Nonu Thakur", 7191);

        s1.display();
        s2.display();
    }

}

class Student{
    String name;  //instance variable
    int rollNo;
    static String college = "Shoolini University";  //static variable

    //constructor
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //method to display the values
    void display() {
        System.out.println("name = " + name + " " + "roll no = " + rollNo + " " + college);
    }
}

