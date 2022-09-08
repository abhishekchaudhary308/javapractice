package tablebooking;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter How many customer do you want to create? ");
		
		int size = sc.nextInt();
		
		Customer[] customers = new Customer[size];
		sc.nextLine();
		
		for(int  i=0; i<customers.length;i++)
		{
			System.out.println("Enter Next customer ");
			
			
			String csms = sc.nextLine();
			
			String[] csmDetails = csms.split(",");
			
			
			Customer e = new Customer();
			e.setId(Long.parseLong(csmDetails[0]));
			e.setName(csmDetails[1]);
			e.setMobileNumber(csmDetails[2]);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			e.setBirthdate(sdf.parse(csmDetails[3]));
			e.setAverageSpendAmount(Double.parseDouble(csmDetails[4]));
			e.setTotalAmount(Double.parseDouble(csmDetails[5]));
			e.setDateEnrolled(sdf.parse(csmDetails[6]));
			e.setRating(Double.parseDouble(csmDetails[7]));
			customers[i] = e;
			System.out.println("Are these customers equal? " + (customers[0].equals(customers[1])));
		}
		
		
		
		
		while(true)
		{
			System.out.println("Enter Option\n1.Search by name\n2.Serach  By dob\n3.Search by rating\n4.Exit");
			
			int option = sc.nextInt();
			
			sc.nextLine();
			
			if(option==1)
			{
				System.out.println("Enter name ");
				String name = sc.nextLine();
				
				Customer e1 =ContactBo.findCustomerByName(customers, name);
				
				System.out.println(e1);
			}
			// end of 1 
			
			
			if(option==2)
			{
				System.out.println("Enter date ");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String date = sc.nextLine();
				Date D1 = sdf.parse(date);
				Customer e1 =ContactBo.findCustomerByDate(customers, D1);
				
				System.out.println(e1);
			}
			// end of 2
			
			if(option==3)
			{
				System.out.println("Enter rating ");
				double rating = sc.nextDouble();
				
				Customer e1 =ContactBo.findCustomerByRating(customers, rating);
				
				System.out.println(e1);
			}
			
			// end of 3
			
			if(option <1 || option> 4)
			{
				sc.close();
				System.exit(0);
			}
		}

	}

}
