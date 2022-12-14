package assignment3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ValidateFunct3 {

	public static boolean NumbPlate(String str)
	{
		String str2= str.toUpperCase();
		String details[] =	str2.split("-");
		

		for(int i = 0; i < details.length; i++) {
			if(i%2==0) {
				for(int j = 0; j < details[i].length(); j++){    
					if (details[i].charAt(j) < 'A' || details[i].charAt(j) > 'Z') {
						return false;
					}
				}
			}
			if(i%2!=0) {
				for(int j = 0; j < details[i].length(); j++){    
					if (details[i].charAt(j) < '0' || details[i].charAt(j) > '9') {
						return false;
					}
				}
			}
		}	
		return true;
	}
	public static StringBuilder NumbPlateConversion(String str)
	{
		
		int index1 = 2;
		int index2 = 5;
		int index3 = 8;
		char ch = '-';
		StringBuilder string = new StringBuilder(str.toUpperCase());
		string.setCharAt(index1, ch);
		string.setCharAt(index2, ch);
		string.setCharAt(index3, ch);

		return string;
	}
	public static int DLValidation(String DL) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(DL);
		Instant instant = date.toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();
		int period = Period.between(givenDate, LocalDate.now()).getYears();
		return period;
	}
}
