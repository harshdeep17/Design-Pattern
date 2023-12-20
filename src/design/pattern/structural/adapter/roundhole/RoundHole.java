package design.pattern.structural.adapter.roundhole;

public class RoundHole {
    private int radius;
    RoundHole(int radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public boolean fits(RoundPeg peg){
        return this.radius>=peg.getRadius();
    }
}
