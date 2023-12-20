package design.pattern.creational.factory.ui.components;

public class AndroidButton implements Button{
    @Override
    public void onClick() {
        System.out.println("android onClick");
    }
}
