package classmorning;
import java.util.*;

public class javaclass {
 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the basic salary");
	    int salary = sc.nextInt();
	    System.out.println("Please Enter the HRA");
	    int Hra = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Please Enter the name");
	    String name = sc.nextLine();
	    System.out.println("Please Enter the deduction");
	    int da = sc.nextInt();
	    System.out.println("Please Enter the Status");

	    Boolean status = sc.nextBoolean();
	    sc.nextLine();
	    System.out.println("Please Enter the Gender");
	    String gender = sc.nextLine();
	    System.out.println("Please Enter the designation");
	    String designation = sc.nextLine();
	    
	    double grosssalary = salary + Hra + da;
	    double netsalary = grosssalary - da;
	    
	    System.out.printf("%-20s%-20S%-20s%-20s%-20S%-20s%-20s%-20s%-20s\n","Basicsalary","Hra","Name","Deduction","Status","Gender","Designation","Grosssalary","Netsalary");
        System.out.printf("%-20d%-20d%-20s%-20d%-20b%-20s%-20s%-20f%-20.2f\n",salary,Hra,name,da,status,gender,designation,grosssalary,netsalary);
	    
	    
//	   .out.println("gross sallaty"+ grosssalary );
//	    System.out.println("gros Systems netsalary"+ netsalary );
   

	}

}
