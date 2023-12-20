package design.pattern.structural.adapter.roundhole;

public class Client {
    public static void main(String[] args) {
        RoundHole hole=new RoundHole(5);
        RoundPeg  p1=new RoundPeg(4);
        RoundPeg  p2=new RoundPeg(7);
        SquarePeg p3=new SquarePeg(3);
        SquarePeg p4=new SquarePeg(7);
        SquarePegAdapter squarePegAdapter1=new SquarePegAdapter(p3);
        SquarePegAdapter squarePegAdapter2=new SquarePegAdapter(p4);
        System.out.println(hole.fits(p1));
        System.out.println(hole.fits(p2));
        System.out.println(hole.fits(squarePegAdapter1));
        System.out.println(hole.fits(squarePegAdapter2));
    }
}
