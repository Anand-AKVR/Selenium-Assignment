package weak1.day2;

public class StringLength {

	public static void main(String[] args) {
		String input = " Hello World" ;
		String[] arr = input.split(" ");
		System.out.println(arr[arr.length-1].length());
	}

}
