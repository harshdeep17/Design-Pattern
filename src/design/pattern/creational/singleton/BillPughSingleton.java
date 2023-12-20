package design.pattern.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){
        System.out.println("Object created");
    }
    private static class SingletonHelper{
        private static final BillPughSingleton singletonObj=new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.singletonObj;
    }
}
