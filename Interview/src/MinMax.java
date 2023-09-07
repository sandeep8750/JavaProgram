
public class MinMax {
	public static void main(String[] args) {

		int [] ar = {23,32,45,67,2,12};
		
		int min, max ;
		
		if (ar[0] > ar[1]) {
            max = ar[0];
            min = ar[1];
        } else {
            max = ar[1];
            min = ar[0];
        }
		
		for(int i=0 ; i<ar.length ; i++)
		{
			if(ar[i]<min)
			{
				min = ar[i];
			}
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		
		System.out.println("maximum number in arr is "+ max);
		System.out.println("minmum number in arr is "+ min);
	}
}
