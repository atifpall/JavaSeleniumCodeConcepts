
public class AssignmentTwo {
	
	public static void PrintStatement(int x) 
	{
		if(x==5)
	{
		for (int i=1;i<=x;i++) 
		{
			System.out.println("I am Batman");
		}
	}
		
		if(x==9) 
		{
			for (int i=1;i<=x;i++) 
			{
				System.out.println("I am Batman " +i);
			}
		}
			
	}	
	
	public static void Print_10_To_1_UsingWhileLoop(int x)
	{
		int i=x;
		while(i>=1)	
		{
			System.out.println(i);
			i--;
		}
	}
	
	public static void Print_10_To_1_UsingForLoop(int x)
	{
	
		for(int j=x; j>=1; j--) 
		{
			System.out.println(j);
		}
	}
	
	public static void Print_10_To_1_UsingDoWhileLoop(int x)
	{
	
		int k=x;
        do{
             System.out.println(k);
             k--;
        }
        	while(k>=1);
	}
	
	public static void PrintUsingWhileLoop(int x)
	{
		int i=x;
		while(i>=1)	
		{
			System.out.println("Hello World");
			i--;
		}
	}
	
	public static void Quit_at_7_Using_WhileLoop(int x)
	{
		int a = x;
		int j = 1;
		while(j<=a)	
		{
			System.out.println(j);
			j++;
			
			if(j%7==0) 
				break;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//Q1
		AssignmentTwo.PrintStatement(5);
		
		//Q2
		AssignmentTwo.PrintStatement(9);
		
		
		//Q3 - WAP to print 10 to 1 using for, while and do-while loop
		AssignmentTwo.Print_10_To_1_UsingWhileLoop(10);
		AssignmentTwo.Print_10_To_1_UsingForLoop(10);
		AssignmentTwo.Print_10_To_1_UsingDoWhileLoop(10);
		
		//Q4 - Write a program in Java to print "Hello World" ten times using while loop
		AssignmentTwo.PrintUsingWhileLoop(10);
		
		//Q5 - Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		AssignmentTwo.Quit_at_7_Using_WhileLoop(10);	
		
	}

}
