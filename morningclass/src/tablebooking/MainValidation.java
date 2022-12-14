package tablebooking;
import java.util.*;
import java.time.LocalDate;  
import java.time.Period;  

public class MainValidation {

	public Boolean validateLuckyCustomer(String number)
	{
	long n= Long.parseLong(number);
		long sum = 0;
		while (n > 0 || sum > 9)
		{
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		if(sum==1) {
			return true;
		}else
			return false;
	}
	public Boolean validateName(String name) {
		String str = name.toLowerCase();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!(ch >= 'a' && ch <= 'z')) {
				return false;
			}
		}
		return true;
	}
	public Boolean validateAge(LocalDate dob) { 
		String nowDate = "01-01-2018";
		LocalDate curDate = LocalDate.parse(nowDate);   
		if (Period.between(dob, curDate).getYears()> 18)   
		{  
		return true ;  
		}  
		else  
		{  
		return false;  
		}  
		}  
	}
		





