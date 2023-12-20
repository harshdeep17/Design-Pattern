package design.pattern.creational.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton singletonObj=null;
    private LazyInitializedSingleton(){
        System.out.println("Object Created");
    }
    public static LazyInitializedSingleton getInstance(){
        if(singletonObj==null) {
            singletonObj = new LazyInitializedSingleton();
        }
        return singletonObj;
    }
}
