package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        Human ajay = new Human(19,"Ajay Thakur",60000,false);
        Human anu = new Human(18,"Anurag Thakur",70000,false);

        System.out.println(Human.population);
        System.out.println(Human.population);

        //fun(); Non-static method 'fun()' cannot be referenced from a static context
        //to run this method here , we have to make obj for it

        Main obj = new Main();
        obj.fun();
    }

    void greeting (){
        System.out.println("hii there");
    }

    void fun(){
        greeting();
    }
}
