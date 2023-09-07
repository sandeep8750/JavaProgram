
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 38,52,1,18,6,62,13} ;
		
		for(int i=0;i<a.length-1;i++)
		{
			int minindex =i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[minindex])
				{
					minindex=j;
				}
				int temp =a[minindex];
				a[minindex]=a[i];
				a[i]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
