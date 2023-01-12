package weak1.day2;

public class SquareRoot {

	public static void main(String[] args) {
		
		int num = 8 ;
		int t;  
	    int sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		System.out.println(sqrtroot);  
		}  
		}  
		
		
		
	

	


