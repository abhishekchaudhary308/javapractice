package classmorning;

public class ThreadDemo {
	public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        SampleThread st = new SampleThread(); //new born thread; here id,name and priority is provided
        st.start(); //runnable state - ready to run state
// jvm maintains a run pool, every thread will join the thread pool 
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getPriority());
        st.setName("abc");
        st.setPriority(10);
        System.out.println();
    }
}
