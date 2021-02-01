package JavaSessions;

public class ReverseStringConcept {

	public static void reverseOfString(String name) 
	
	{
	
		int len = name.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--) 
		{
			rev = rev+name.charAt(i);
		}
		
		System.out.println(rev);
	}
	
	
	
	public static void main(String[] args) {	
		ReverseStringConcept.reverseOfString("sadaf");

		
		
		
		
	}

}
