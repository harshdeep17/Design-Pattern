package design.pattern.creational.factory.ui;

import design.pattern.creational.factory.ui.components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter f=new Flutter();
        UIFactory IOSUIFactory=f.createUIFactory("ios");
        Button b1=IOSUIFactory.createButton();
        b1.onClick();
        UIFactory AndroidUIFactory=f.createUIFactory("android");
        Button b2=AndroidUIFactory.createButton();
        b2.onClick();
    }
}
