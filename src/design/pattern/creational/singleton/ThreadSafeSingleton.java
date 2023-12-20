package design.pattern.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singletonObj=null;
    private ThreadSafeSingleton(){
        System.out.println("Object created");
    }
//    public static synchronized ThreadSafeSingleton getInstance(){
//        if(singletonObj==null){
//            singletonObj=new ThreadSafeSingleton();
//        }
//        return singletonObj;
//    }
    public static ThreadSafeSingleton getInstance(){
        if(singletonObj==null){
            synchronized (ThreadSafeSingleton.class){
                if(singletonObj==null)
                    singletonObj=new ThreadSafeSingleton();
            }
        }
        return singletonObj;
    }

}
