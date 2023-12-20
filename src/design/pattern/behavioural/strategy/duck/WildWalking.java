package design.pattern.behavioural.strategy.duck;

public class WildWalking implements WalkingBehavior{
    @Override
    public String walk() {
        return "Wild walking";
    }
}
