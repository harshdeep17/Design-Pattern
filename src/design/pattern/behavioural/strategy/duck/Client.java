package design.pattern.behavioural.strategy.duck;

import java.util.ArrayList;
import java.util.Arrays;;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck=new Duck(new WildFlying(),new WildWalking());
        Duck cityDuck=new Duck(new CalmFlying(),new CalmWalking());
        Duck mountainDuck=new Duck(new HighAltitudeFlying(),new CalmWalking());
        Duck cloudDuck=new Duck(new HighAltitudeFlying(),new NoWalking());
        ArrayList<Duck> ducks=new ArrayList<>(Arrays.asList(wildDuck,cityDuck,mountainDuck,cloudDuck));
        for(Duck d:ducks){
            System.out.println(d.fly()+"->"+d.walk());
        }
    }
}
