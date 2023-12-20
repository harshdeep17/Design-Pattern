package design.pattern.behavioural.strategy.duck;

public class NoWalking implements WalkingBehavior{
    @Override
    public String walk() {
        return "No walking";
    }
}
