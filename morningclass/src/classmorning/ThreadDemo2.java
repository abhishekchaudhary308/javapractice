package classmorning;

public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
        SampleThread st = new SampleThread();
        
        MyRunnable mr = new MyRunnable();
        
        Thread t = new Thread(mr);
        t.start();
        t.join();
        st.start();
        

    }
}
