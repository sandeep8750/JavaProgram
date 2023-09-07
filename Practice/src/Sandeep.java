class Sandeep
{
	static String rev(String S)
	{
		int j =0;
		String sand [] = new String[50];
		String [] sar = S.split("");
		for(int  i = sar.length-1  ; i>=0 ; i++)
		{
			sand[j]= sar[i];
			j++;
		}
		return   ;
	}
	public static void main(String arg[] )
	{
		System.out.println("sandeep");
	}
}