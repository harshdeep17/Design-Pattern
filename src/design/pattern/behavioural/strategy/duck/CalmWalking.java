package design.pattern.behavioural.strategy.duck;

public class CalmWalking implements WalkingBehavior{
    @Override
    public String walk() {
        return "Calmly walking";
    }
}
