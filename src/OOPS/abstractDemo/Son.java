package OOPS.abstractDemo;

public class Son extends Parent{
    @Override
    void career() {
        System.out.println("I want to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love myself");
    }

    public Son(int age){
        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }
}

