package classmorning;
import java.util.*;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the number");
		int number = sc.nextInt();
		
		switch(number)
        {
            case 1:
                System.out.println("Monday morning");
                break;
            case 2:
                System.out.println("Tuesday trainig");
                break;
            case 3:
                System.out.println("Well Wednesday");
                break;
            case 4:
                System.out.println("Thrilled Thursday");
                break;
            case 5:
                System.out.println("Fun Friday");
                break;
            case 6:
                System.out.println("Soothing Saturday");
                break;
            case 7:
                System.out.println("Sleepy Sunday");
                break;
            default:
                System.out.println("Please enter the valid number from 1 to 7");
                break;
        }
		sc.close();
	}

}
