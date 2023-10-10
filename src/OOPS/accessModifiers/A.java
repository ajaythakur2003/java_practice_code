package OOPS.accessModifiers;

public class A {

    private int num;
    String name;
    int[] arr;


    //getter method to  get private num in another file
    public int getNum() {
        return num;
    }

    //setter method to set num value in other file
    public void setNum(int num) {
        this.num = num;
    }

    public A(int a, String name) {
        this.num = a;
        this.name = name;
        this.arr = new int[num];
    }
}
