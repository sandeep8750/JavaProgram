import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= {10,20,30,40,50,60,70,80,90};
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter key as you want to search : ");
		int key = input.nextInt();
		
		int low=0;
		int high= ar.length-1;
		
		while(low<=high)
		{
			int mid= (low+high)/2;
			
			if(key==ar[mid])
			{
				System.out.println("key " + key + " key found at index " + (mid+1)  );
				break;
			}
			else if(key<ar[mid])
			{
				high=mid-1;
			}
			else if(key> ar[mid])
			{
				low=mid+1;
			}
				
		}
		if(low>high)
		{
			System.out.println("key is not found ");
		}
		
		
	}

}
