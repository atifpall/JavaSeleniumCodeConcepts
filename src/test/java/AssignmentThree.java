import java.util.ArrayList;
import java.util.Collections;

public class AssignmentThree {

	public static void main(String[] args) {
		
	ArrayList<Character> ar1 = new ArrayList<Character>();
	ar1.add('A');
	ar1.add('B');
	ar1.add('C');
	ar1.add('D');
	
	System.out.println(ar1);
	
	ar1.forEach(name -> System.out.println(name));
	ar1.forEach(name -> System.out.println(name.toLowerCase(name)));
	
	System.out.println("--------------------");
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("Atif");
	ar2.add("Kasif");
	ar2.add("Mumma");
	ar2.add("Aksatha");
	
	System.out.println(ar2);
	ar2.forEach(name -> System.out.println(name.toLowerCase()));
	
	System.out.println("--------------------");
	
	ArrayList<String> empList = new ArrayList<String>();
	empList.add("Tom");
	empList.add("Atif");
	empList.add("Kasif");
	empList.add("Naveen");
	
	System.out.println(empList);
	
	Collections.sort(empList);
	System.out.println(empList);
	
	
	Collections.sort(empList, Collections.reverseOrder());
	System.out.println(empList);

	System.out.println("--------------------");
	
	
	
		
		

	}

}
