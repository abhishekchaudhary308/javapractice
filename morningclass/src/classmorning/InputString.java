package classmorning;

public class InputString {
	
	
	public static int prefix() {
		int output= 0;
		String input[] = {"100","111","10100","10","1111","1000000"};
		for(int i =0; i<input.length; i++) {
			if(input[i].length()>2) {
				if(input[i].startsWith("10")) {
					++output;
				}
			}
		}
		return output;
		
	}
	public static void main(String[] args) {
		InputString i = new  InputString();
		
		System.out.println(i.prefix());
	}
}
