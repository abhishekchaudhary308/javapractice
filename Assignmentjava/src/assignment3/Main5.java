package assignment3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main5 {
	 public static boolean isValid(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	 
	public static void main(String[] args) throws ParseException, InvalidEmailException {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Members");
		int size=sc.nextInt();
		List<Member> members=new ArrayList<Member>();
		sc.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("enter the details");
			String str = sc.nextLine();

			String details[] = str.split(",");

		Member m=new Member();
	   m.setId(Long.parseLong(details[0]));
	    m.setFirstName(details[1]);
	    m.setLastName(details[2]);
	    m.setEmail(details[3]);
	    m.setContactNumber(details[4]);
	    m.setLicenseNumber(details[5]);
	    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	    m.setLicenseStartDate(sdf.parse(details[6]));

	    m.setLicenseExpiryDate(sdf.parse(details[7]));
	    members.add(m);
			
		}
		System.out.println("the Members details are ");
		for(Member m:members) {
			
		if(isValid(m.getEmail())) {
			System.out.println(m);
		}
		else
		{
			throw new InvalidEmailException("Invalid Email");
		}
		}
		

	}

}

