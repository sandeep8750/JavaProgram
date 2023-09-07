
public class VowelAndConsonent {
	public static void main(String[] args) {
		 int vCount = 0, cCount = 0;  
         
	        //Declare a string  
	        String str = "sandeep";  
	          
	        //Converting entire string to lower case to reduce the comparisons  
	        str = str.toLowerCase(); 
	        char vowel[] = new char [str.length()-1];
		    char consnent[] = new char [str.length()-1];
	          
	        for(int i = 0; i < str.length(); i++) {  
	            //Checks whether a character is a vowel  
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
	                //Increments the vowel counter  
	            	vowel[cCount] = str.charAt(i);
	                vCount++; 
	            }  
	            //Checks whether a character is a consonant  
	            else if(str.charAt(i) > 'a' && str.charAt(i)<='z') {    
	                //Increments the consonant counter  
	            	consnent[vCount] = str.charAt(i);
	                cCount++; 
	            }  
	        }  
	        
	        for(char ch : vowel)
	        {
	        	System.out.print(ch+"");
	        }
	        
	        System.out.println();
	        for(char ch : consnent)
	        {
	        	System.out.print(ch+"");
	        }
	        System.out.println("Number of vowels: " + vCount);  
	        System.out.println("Number of consonants: " + cCount);
	        
	        System.out.println(Math.pow(vCount, cCount));
	}
}
