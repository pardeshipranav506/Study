
public class Start_Patt {

	public static void main(String[] args) {
		int i,j,k;

		for(i=1; i<=5; i++) {
			
			for(j=5; j>i; j--) {
				System.out.print(" ");
				
			}
			for(k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
/* (i=1; i<=5; i++) */ for(i=1; i<=5; i++) {
			
/* (j=5; j>i; j--)  */	 for(j=1; j<i; j++) {
							System.out.print(" ");
				
						     }
/* (k=1; k<=i; k++) */	 for(k=5; k>=i; k--) {
							System.out.print("* ");
								}
							System.out.println();
							}
		
		
		
		
		
		
		
		
	}}
