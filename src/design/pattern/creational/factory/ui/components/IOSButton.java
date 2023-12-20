package design.pattern.creational.factory.ui.components;

public class IOSButton implements Button{
    @Override
    public void onClick() {
        System.out.println("ios onClick");
    }
}
