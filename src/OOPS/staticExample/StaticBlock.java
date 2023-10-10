package OOPS.staticExample;

//this is the demo to show initialization of static variable
public class StaticBlock {

    static int a = 4;
    static int b;

    //static block
    //will only run once
    static{
        System.out.println("i am in static block");
        b = a * 5;
    }


    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
//        System.out.println(b);
        System.out.println(StaticBlock.b);
//        b += 3;
        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b);
    }
}
