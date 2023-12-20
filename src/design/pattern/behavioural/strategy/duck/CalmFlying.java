package design.pattern.behavioural.strategy.duck;

public class CalmFlying implements FlyingBehavior{
    @Override
    public String fly() {
        return "Calmly flying";
    }
}
