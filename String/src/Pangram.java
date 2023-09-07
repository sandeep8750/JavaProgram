public class Pangram
{
	public static void main(String [] args )
	{
		String s1 ="THE QUICK BROWN FOX JUMPS THE LAZY DOG";
		s1=s1.replace(" ","");
		char ch[]=s1.toCharArray();
		int ar[] = new int[26];
		boolean sandeep=false ;
		
		
		for(int i=0;i<ch.length-1;i++)
			{	
				int index=ch[i]-65;
				ar[index]++;	
				
			}
		for(int i=0;i<ar.length-1;i++)
			{
			if(ar[i]==0)
			{
				sandeep=true;
			}
			}

		if(sandeep==true )
		{
			System.out.println("Not a Pangram");
		}
		else if(sandeep==false)
		{
			System.out.println("Is a  Pangram");
		}
	}
}