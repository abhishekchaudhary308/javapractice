package classmorning;

public class ThreadClass extends Thread {
	public void run() {
	    System.out.println("This code is running in a thread");
	  }
}
 class RunThread implements Runnable {
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}
