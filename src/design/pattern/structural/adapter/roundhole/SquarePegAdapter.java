package design.pattern.structural.adapter.roundhole;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg peg;
    SquarePegAdapter(SquarePeg peg){
        super();
        this.peg=peg;
    }
    @Override
    public double getRadius() {
        return (peg.getWidth()*Math.sqrt(2)/2);
    }
}
