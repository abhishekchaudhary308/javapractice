package classmorning;

public class EvenDemo {
	public static void main(String[] args) {
        EvenChecker Check = (int num) -> {
        	if(num%2==0) {
                return true;
            }
            else
            	return false;
        };
        boolean d = Check.isEven(5);
        System.out.println("Even Number : " + d);
    }
}
