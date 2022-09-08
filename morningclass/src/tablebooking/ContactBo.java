package tablebooking;

import java.util.Date;

public class ContactBo {
	
	

	public static Customer findCustomerByName(Customer[] customers, String name)
	{
		
		  for(int i= 0; i<customers.length;i++)
		  {
			  if(customers[i].getName().equals(name))
			  {
				  return customers[i];
			  }
		  }
		
		
		return null;
	}
	public static Customer findCustomerByDate(Customer[] customers, Date date)
	{
		
		  for(int i= 0; i<customers.length;i++)
		  {
			  if(customers[i].getBirthdate().equals(date))
			  {
				  return customers[i];
			  }
		  }
		
		
		return null;
	}
	public static Customer findCustomerByRating(Customer[] customers, double rating)
	{
		
		  for(int i= 0; i<customers.length;i++)
		  {
			  if(customers[i].getRating()==(rating))
			  {
				  return customers[i];
			  }
		  }
		
		
		return null;
	}
	
}
