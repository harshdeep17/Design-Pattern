package design.pattern.creational.singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton singletonObj= new EagerInitializedSingleton();
    private EagerInitializedSingleton(){
        System.out.println("Object Created");
    }
    public static EagerInitializedSingleton getInstance(){
        return singletonObj;
    }
}
