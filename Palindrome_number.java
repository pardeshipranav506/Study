
public class Palindrome_number {

	
	
	
	
	
	
	public static void main(String[] args) {
		int a=10;
		int org=a;
		int rev = 0;
		
		while(a!=0) {
			rev = rev*10+a%10;
			a=a/10;
			
		}
		System.out.println(rev);
		if(rev==org) {
			System.out.println("Number is palindrome = "+rev);
		}
		else {
			System.out.println("Number is not palindrome = "+rev);
		}

	}

}
