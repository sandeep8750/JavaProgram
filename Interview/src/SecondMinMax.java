
public class SecondMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 23, 32, 45, 67, 2, 12 };
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i : ar) {
			System.out.print(i + " ");
		}

		System.out.println("       " + ar[ar.length - 2]);
	}

}

class largest {

	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	
	int ar[];
	
	for(int i = 0;i<ar.lenght;i++){
		if (ar[i] > largest) {
			secondLargest = largest;
			largest = ar[i];
		} else if (ar[i] > secondLargest && ar[i] != largest) {

			secondLargest = ar[i];
		}
	}

}

}