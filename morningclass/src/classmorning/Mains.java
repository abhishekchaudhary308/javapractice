package classmorning;


class Mains
{
	public static boolean isAlphaNumeric(String s) {
		return s != null && s.matches("^[a-zA-Z0-9@.]*$");
	}

	public static void main(String[] args)
	{
		String s = "ABC@.";
		System.out.println("IsAlphaNumeric: " + isAlphaNumeric(s));
	}
}