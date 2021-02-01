package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {

		int p = 10;
		
		try {
			int div = p/2;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			}
		
		
		finally {
			System.out.println("In the finally block...");
		}
		
		System.out.println("Bye!!!!");

		FinallyConcept fc = new FinallyConcept();
		int value = fc.getMarks("Tom");
		System.out.println(value);
		
		}

	public int getMarks(String name) {
		
		if(name.equals("Tom")) 
		{
			try {
				int i =9/0;
			}
			catch(ArithmeticException e) {
				return 98;
			}
			
			finally {
				System.out.println("Bye");		
				return 100;
				}
			
			
		
			
		}
		else if(name.equals("Peter")) 
		{
			return 90;
		}
		else {
			System.out.println("name is not found...");
			return -1;
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
