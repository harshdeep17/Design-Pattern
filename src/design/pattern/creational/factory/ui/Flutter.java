package design.pattern.creational.factory.ui;

public class Flutter {
    UIFactory createUIFactory(String platform){
        if(platform.equals("android")){
            return new AndroidUIFactory();
        }else if(platform.equals("ios")){
            return new IOSUIFactory();
        }
        return null;
    }
}
