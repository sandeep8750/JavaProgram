package in.ineuron.java;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		 Scanner out = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
	int a = 	out.nextInt();
	int fact =1 ;
	
	for(int i =1 ; i<= a ; i++)
	{
	
		fact = fact*i;
	}
	
	System.out.println("factorial of number is :: " +  fact );
	}

}
