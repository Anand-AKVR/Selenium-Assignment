package weak1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madam", reverseStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " Palindrome");
		} else {
			System.out.println(str + " Not Palindrome");
		}

	}

}
