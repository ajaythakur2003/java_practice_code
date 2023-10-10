package OOPS.inheritance;

public class Box {
    double h;
    double l;
    double w;

    Box (){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box (double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

     Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box (Box other){
        this.h = other.h;
        this.w = other.w;
        this.l = other.l;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
