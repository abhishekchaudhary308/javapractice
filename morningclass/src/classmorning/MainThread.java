package classmorning;

public class MainThread {

    public static void main(String[] args) {
          SampleThread st = new SampleThread();
          st.start();
          MyRunnable mr = new MyRunnable();
          Thread t =  new Thread(mr);
          t.start();
          Runnable r = new Runnable() {
                 
                 @Override
                 public void run() {
                  System.out.println("Anonymous Thread");
                 }
                };
                
                Thread t1 = new Thread(r);
                t1.start();
                Thread t2 = new Thread(()->System.out.println("Lambda Thread"));
                t2.start();
    }
}