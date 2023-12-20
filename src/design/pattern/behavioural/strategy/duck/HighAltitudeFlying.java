package design.pattern.behavioural.strategy.duck;

public class HighAltitudeFlying implements FlyingBehavior{
    @Override
    public String fly() {
        return "High altitude flying";
    }
}
