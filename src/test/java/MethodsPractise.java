import java.util.Scanner;

public class MethodsPractise {

	
	public static void sumCalc(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	public static void prodCalc(int a, int b) {
		int prod=a*b;
		System.out.println(prod);
		
	}
	
	public static void circumferenceOfCircleCalc(double r) {
		double pi =3.14;
		double circumference = 2* pi* r;
		double area = pi*r*r;
		System.out.println("The circumference of the circle is: " + circumference + " and " + "area is: " + area );
		
	}
	
	public static void highestNum(int a, int b, int c) 
	{
		if(a>b && a>c) 
		{
			System.out.println("The greatest no. is " + a);
		}
		else if(b>c && b>a) 
		{
			System.out.println("The greatest no. is " + b);
		}
		else
			System.out.println("The greatest no. is " + c);
		
	}
	
	public static void lowestNum(int a, int b, int c) 
	{
		if(a<b && a<c) 
		{
			System.out.println("The smallest no. is " + a);
		}
		else if(b<c && b<a) 
		{
			System.out.println("The smallest no. is " + b);
		}
		else
			System.out.println("The smallest no. is " + c);
		
	}
	
	
	public static void evenOddNum(int a) 

	{
		if(a%2==0) 
		{
			System.out.println(a + " is an even number");
		}
		else 
			System.out.println(a + " is an odd number");
	}
	
	
	public static void votingAge(String name, int age) 
	{
		if(age>=18) 
		{
			System.out.println(name + " Qualifies to vote");
		}
		else
			System.out.println(name + " is not Qualified to vote");
	}
	

	
	public static void displayGrades(String name, int marks) 
	{
		if(marks>90 && marks<101) 
		{
			System.out.println(name + " has received Grade AA");
		}
		else if(marks>80 && marks<=90) 
		{
			System.out.println(name + " has received Grade AB");
		}
		else if(marks>70 && marks<=80) 
		{
			System.out.println(name + " has received Grade BB");
		}
		else if(marks>60 && marks<=70) 
		{
			System.out.println(name + " has received Grade BC");
		}
		else if(marks>50 && marks<=60) 
		{
			System.out.println(name + " has received Grade CD");
		}
		else if(marks>40 && marks<=50) 
		{
			System.out.println(name + " has received Grade DD");
		}
		else
			System.out.println(name + " has received Grade Fail");
	}
	
	
	public static void isPrimeNum() 
	{
		int temp;
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      flag=false;
		      break;
		   }
		}
		
		if(flag)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	}
	
	
	
	public static void main(String[] args) {

		//1.Write a program to print the sum of two numbers entered by user by defining your own method.
		sumCalc(10,20);		
		//2.Define a method that returns the product of two numbers entered by user.
		prodCalc(15,20);
		//3. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
		MethodsPractise.circumferenceOfCircleCalc(12);
		//4.Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		highestNum(34,18,54);
		lowestNum(34,18,54);
		//5.Define a program to find out whether a given number is even or odd.
		evenOddNum(21);
		//6.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
		votingAge("Naveen",17);
		//8.Write a program which will ask the user to enter his/her marks (out of 100). 
		displayGrades("Atif",72);
		//7.Define a method to find out if number is prime or not.
		isPrimeNum();
	}

}
