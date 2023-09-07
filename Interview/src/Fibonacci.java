import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		System.out.println("Enter a Number ::");
		int n = new Scanner(System.in).nextInt();
		System.out.print("0 1 ");
		new fibo().printFibo(n-2 );
		
	}
}

class fibo {
	int prev = 0;
	int next = 1;

	int fibo;

	public  void printFibo(int n) {

		if (n > 0) {
			fibo = prev + next;

			prev = next;
			next = fibo;
			System.out.print(fibo+" ");
			printFibo(n - 1);
		}

	}
}
