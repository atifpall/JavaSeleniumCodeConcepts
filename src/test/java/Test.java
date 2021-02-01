
public class Test {

	public static void main(String[] args) {
		/*int i = 10;
		int j=++i;
		System.out.println(i);
		System.out.println(j);
		
		char a='5';
		char b='6';
		System.out.println(a+b);
		
		int x=10;
		int y=x++;
		System.out.println(x);
		System.out.println(y);
		
		int f=10;
		int g=f--;
		System.out.println(f);
		System.out.println(g);*/
		
		Test.higestNumber(700, 700, 80, 45);

	}

	public static void higestNumber(int a, int b, int c, int d) {
	
		if(a>b && a>c && a>d)  {
			System.out.println("a is the greatest: " + a);
			
		}
		else if(b>c && b>d && b>a) {
			System.out.println("b is the greatest: " + b);
		}
		else if(c>d && c>a && c>b) {
			System.out.println("c is the greatest: " + c);
		}
		else 
		{
			System.out.println("d is the greated of all: " +d);
		}
	}
	
	
	
}
