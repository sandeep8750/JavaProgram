import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		while (true) {
			int i, m = 0, flag = 0;
			int n = new Scanner(System.in).nextInt();

			//m = n / 2;
			for (int j = 1; j < n; j++) {
				if (j == 0 || j == 1) {
				flag = 1;
				} else {
					for (i = 2; i <= j/2; i++) {
						if (j % i == 0) {
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						System.out.println(j + " is prime number");
					}
				}
			} // end of el
		}
	}

}
