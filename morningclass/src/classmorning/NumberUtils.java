package classmorning;

public class NumberUtils {

	public static String convertToHexadecimal(int numb) {
		String hex= Integer.toHexString(numb);
		return hex;
	}

	public static void main(String[] args) {
		System.out.println(convertToHexadecimal(10));
	}
}
