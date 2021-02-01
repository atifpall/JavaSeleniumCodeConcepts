
public class ExampleCoding {
	static int result =0;
	
	
public static int TestData(int x, int y, int z) {
		return result = -x+(y*z);	
	}
	
public static int TestData2(int x, int y, int z) {
		return result = (x+y)%z;
	}
	
public static int TestData3(int x, int y, int z, int m) {
	return result = x + (-y*z)/m;
}

public static int TestData4(int x, int y, int z, int m, int n, int o) {
	return result = x + (y/z) * m -n % o;
}


public static void higestNumber(int a, int b, int c) {
	if(a>b && a>c)  
	{
		System.out.println("a is the greatest: " + a);
	}
	else if(b>c && b>a) 
	{
		System.out.println("b is the greatest: " + b);
	}
	else 
	{
		System.out.println("c is the greatest: " + c);
	}
  }


public static void Determine(int e) 
{
	if(e>0) 
	{
		System.out.println(e + " is a positive number");
	}
	
	else 
	{
		System.out.println(e + " is a negative number");
	}
}



	public static void main(String[] args) {
		
		//Q1
		String s= "Hello ";
		String s1 ="Naveen K";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s +s1);
		
		//Q2
		int i = 74;
		int j=36;
		int sum = i+j;
		System.out.println(sum);
		
		//Q3
		int a=50;
		int b=3;
		int output= a/b;
		System.out.println(output);
		
		//Q4 Through Methods
		ExampleCoding.TestData(5, 8, 6);
		System.out.println(result);
		ExampleCoding.TestData2(55, 9, 9);
		System.out.println(result);
		ExampleCoding.TestData3(20, 3, 5,8);
		System.out.println(result);
		ExampleCoding.TestData4(5, 15, 3,2, 8,3);
		System.out.println(result);
		
		//Q4 Direct ways
		
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9 );
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
		
		//Q5
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		
		//Q6
		String f="Hello Selenium ";
		char c ='t';
		System.out.println(f+c);
		
		//Q7
		int p=100;
		int q=200;
		int r=3400;
		System.out.println("Your total amount is: " + (p+q+r));
		
		//Q8
		byte b3 = (byte) 065; 
		System.out.println(b3);
		
		//Conditional Operators Q1
		ExampleCoding.higestNumber(25,78,87);
		
		//Conditional Operators Q2
		ExampleCoding.Determine(35);
		ExampleCoding.Determine(-11);
		
	}

}
