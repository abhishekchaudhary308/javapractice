package assignment3;
import java.text.ParseException;
import java.util.Scanner;

public class ValidateFunctMain3 {

	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Select Option \n 1:Valid Car registration Number\n 2:Convert Car registration Number\n 3:Valid Driving License\n 4:Exit");
			int option = sc.nextInt();
			sc.nextLine();

			if (option == 1) {
				System.out.println("Enter the Registeration Number");
				String str = sc.nextLine();
				if(ValidateFunct3.NumbPlate(str)) {
					System.out.println("Number is valid");
				}
				else System.out.println("Number is invalid");
			}

			if(option==2) {
				System.out.println("Enter the Registeration Number to be converted");
				String str = sc.nextLine();
				System.out.println("the number is " +ValidateFunct3.NumbPlateConversion(str));
			}
			if(option==3) {

				System.out.println("Enter the driving licence issue date");
				String str = sc.nextLine();
				int age = ValidateFunct3.DLValidation(str);
				if(age<10) {
				System.out.println("The driver licence is valid and the licence is " + age + " year old");
				}
				else
					System.out.println("The driver licence is invalid and the licence is " + age + " year old");	
			}
			if(option<1 || option>3) {
				System.exit(0);
				sc.close();
			}}
	}
}
