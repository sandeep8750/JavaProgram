
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SANDEEP";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Stirng is palindrom");
		}
		else 
		{
			System.out.println("Stirng is not palindrom");
		}
	}

}
