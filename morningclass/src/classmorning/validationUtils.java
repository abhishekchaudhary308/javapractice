package classmorning;

public class validationUtils {

	public static boolean validateEmail(String email) {
		char ch = '@';
		int frequency=0;
		String regex = "^[a-zA-Z0-9@.]*";
		
	for(int i=0; i <email.length();i++) {
		if(ch == email.charAt(i)) {
            ++frequency;
            if(frequency>1) {
            	return false;
            }
        }
		if(!(email.matches(regex))) {
			return false;
		}
		
//		if(email.charAt(i)<'A'|| email.charAt(i)>'Z'|| email.charAt(i)<'0'|| email.charAt(i)>'9') {
//			return false;
//		}
		if(email.indexOf('@')> email.indexOf('.')) {
			return false;
		}
		if(!((email.endsWith("gmail.com"))||(email.endsWith("yahoo.co"))|| (email.endsWith("yahoo.in")) || (email.endsWith("education.net"))||(email.endsWith("education.org")))){
			return false;
		}
	}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(validateEmail("asdfhasdf@gmail.com"));
	}
}
