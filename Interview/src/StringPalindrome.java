import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		
		while(true) {
		System.out.println("Enter a number or string for palindrom ");
		String s1  = new Scanner(System.in).nextLine();
		String temp = s1; 
		int length = s1.length();
		String rev="" ;
		
		for(int i = length - 1 ; i>=0 ; i--) {
			
			rev = rev + s1.charAt(i);
		}
		
		System.out.println(temp );
		System.out.println(rev);
		
		if(temp.equalsIgnoreCase(rev))
		{
			System.out.println("is palindrome ");
		}
		else {
			System.out.println("is not  palindrome ");			
		}
		}
	}

}