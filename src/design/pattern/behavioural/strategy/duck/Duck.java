package design.pattern.behavioural.strategy.duck;

public class Duck {
    FlyingBehavior flyingBehavior;
    WalkingBehavior walkingBehavior;
    Duck(FlyingBehavior fb,WalkingBehavior wb){
        this.flyingBehavior=fb;
        this.walkingBehavior=wb;
    }
    public String fly(){
       return this.flyingBehavior.fly();
    }
    public String walk(){
        return this.walkingBehavior.walk();
    }
}
