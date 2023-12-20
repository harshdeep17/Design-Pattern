package design.pattern.behavioural.strategy.duck;

public class WildFlying implements FlyingBehavior{
    @Override
    public String fly() {
        return "Wild flying";
    }
}
