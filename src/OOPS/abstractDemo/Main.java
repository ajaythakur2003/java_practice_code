package OOPS.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        son.career();

        Daughter daughter = new Daughter(19);
        daughter.career();
        son.normal();
        System.out.println(son.age);
    }
}
