package design.pattern.structural.adapter.roundhole;

public class RoundPeg {
    private int radius;
    RoundPeg(){}
    RoundPeg(int radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
}
