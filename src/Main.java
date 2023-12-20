import design.pattern.creational.singleton.BillPughSingleton;
;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        PrintStudentList.display();
          Runnable r=new Runnable() {
              @Override
              public void run() {
//                  EagerInitializedSingleton sObj=EagerInitializedSingleton.getInstance();
//                  StaticBlockSingleton sObj=StaticBlockSingleton.getInstance();
//                  LazyInitializedSingleton sObj=LazyInitializedSingleton.getInstance();
//                  ThreadSafeSingleton sObj=ThreadSafeSingleton.getInstance();
                  BillPughSingleton sObj=BillPughSingleton.getInstance();
                  System.out.println(Thread.currentThread().getName() + " " + sObj);
              }
          };
          Thread t1=new Thread(r,"t1");
          Thread t2=new Thread(r,"t2");
          t1.start();
          t2.start();
        BillPughSingleton sObj=BillPughSingleton.getInstance();
          System.out.println(Thread.currentThread().getName() + " " + sObj);
    }
}