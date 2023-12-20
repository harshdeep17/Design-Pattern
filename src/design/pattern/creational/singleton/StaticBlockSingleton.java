package design.pattern.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton singletonObj;
    private StaticBlockSingleton(){
        System.out.println("Object Created");
    }

    //    The static block is stored in the memory during the time of class loading and before the
    //    main method is executed, so the static block is executed before the main method.
    //    It runs once when the class is loaded into the memory
    static {
        try {
            singletonObj = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return singletonObj;
    }
}
