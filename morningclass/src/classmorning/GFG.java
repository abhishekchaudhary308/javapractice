package classmorning;

//Java program for the above approach
//contains only digits
class GFG {

	// Function to check if a string
	// contains only digits
	public static boolean
	onlyDigits(String str, int n)
	{
		if (str.length()!= 10) {
			return false;
		}
		for (int i = 0; i < n; i++) {

			// Check if character is
			// not a digit between 0-9
			// then return false
			if (str.charAt(i) < '0'
				|| str.charAt(i) > '9') {
				return false;
			}
		}
		// If we reach here, that means
		// all characters were digits.
		return true;
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given string str
		String str = "UP-14-GH-1342";
		int len = str.length();

		// Function Call
		System.out.println(onlyDigits(str, len));
	}
}

