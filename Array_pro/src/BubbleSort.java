
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 38,52,1,18,6,62,13} ;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp= a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		
		for(int ele: a)
		{
			System.out.println(ele);
		}
		
	}

}
