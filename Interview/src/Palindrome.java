import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int n = new Scanner(System.in).nextInt();
			int temp = n;

			int rem, rev = 0;
			int rev1 = 0 ;
			
			while (n > 0) {

				rem = n % 10;
				rev = (rev * 10) + rem;
				n= n /100 ;
				
			}
			
			
			
			
			System.out.println(rev);
			
			if (temp == rev) {
				System.out.print("palindrome");
			} else {
				System.out.println("not palindrom");
			}
		}
	}

}