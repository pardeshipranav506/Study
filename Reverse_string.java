
public class Reverse_string {

	public static void main(String[] args) {
		String name = "123456789";
		String revString= "";
		
		int s=revString.length();
		int a=name.length();
		
	/*	System.out.println(s);
		System.out.println(a);		*/
		
		for(int i=a-1; i>=0; i--) {
			revString=revString+name.charAt(i);
		}
		System.out.println("Orignal String = "+name);
		System.out.println("Reverse String = "+revString);
		
	}

}
