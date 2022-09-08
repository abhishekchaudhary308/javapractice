package classmorning;

public class MyRunnable implements Runnable {
	@Override
    public void run() {
        for (int i=0; i<=10;i++) {
            System.out.println("Runnable: " + i);
        }
        Thread t = new Thread();
        try {
            t.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}
