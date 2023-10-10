package OOPS.abstractDemo;

public class Daughter extends Parent{
    void career(){
        System.out.println("I want to be a doctor");
    }


    void partner() {
        System.out.println("I love IronMan");
    }

    public Daughter(int age){
        this.age = age;
    }
}
