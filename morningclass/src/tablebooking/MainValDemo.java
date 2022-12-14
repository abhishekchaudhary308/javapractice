package tablebooking;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class MainValDemo {
	public static void main(String argc[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Option\n1.Validation name\n2.Validation age\n3.Validation lucky number \n4.Exit");

			int option = sc.nextInt();

			sc.nextLine();

			if(option==1)
			{
				System.out.println("Enter name ");
				String name = sc.nextLine();
				MainValidation mv = new MainValidation();
				boolean names = mv.validateName(name);
				if(names) {
					System.out.println("name is valid");
				}else 
					System.out.println("name is invalid");
			}
			if(option==2)
			{  
				System.out.print("Enter date of birth in DD-MM-YYYY format: ");  
				Scanner scanner = new Scanner(System.in);    
				String input = scanner.nextLine();  
				scanner.close(); 
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				String strDate = sdf.format(input); 
				LocalDate date = LocalDate.parse(strDate); 
				MainValidation mv = new MainValidation();
				boolean age = mv.validateAge(date);
				if(age) {
					System.out.println("the age is valid");
				}
				else {
					System.out.println("the age is invalid");
				}
			}

			if(option==3)
			{
				System.out.println("Enter number ");
				String number = sc.nextLine();
				MainValidation mv = new MainValidation();
				boolean sum = mv.validateLuckyCustomer(number);
				if(sum) {
					System.out.println("customer is lucky");
				}else 
					System.out.println("custmer is not lucky");
			}
			if(option <1 || option> 3)
			{
				sc.close();
				System.exit(0);
			}
		}

	}
}
