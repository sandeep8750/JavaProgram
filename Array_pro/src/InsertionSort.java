
public class InsertionSort {

	public static void main(String [] args){
	int [] a= {38,52,1,18,6,62,13} ;
	
	for(int i=0 ;i<a.length;i++)
	{
		int j=i-1;
		int temp=a[i];
		for(;j<a.length-1;j++)
		{
			if(a[j]>temp)
			{
				a[j+1]=a[j];
			}
			else
			{
				break;
			}
		}
		a[j+1]= temp;
	}
	
	for(int ele : a)
	{
		System.out.println(ele);
	}
  }
}
