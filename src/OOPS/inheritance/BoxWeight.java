package OOPS.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w); //calling the parents class constructor
        this.weight = weight;
    }

    BoxWeight (BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

}
