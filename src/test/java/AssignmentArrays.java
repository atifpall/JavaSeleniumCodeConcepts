import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentArrays {
	
	public static void cricketData() 
	{
		Object arr[] = new Object[6];
		arr[0]="Dhoni";
		arr[1]=34;
		arr[2]="Chennai Super Kings";
		arr[3]="07/07/1986";
		arr[4]="Male";
		arr[5]=230.89;

		for(Object e:arr) 
		{
			System.out.println(e);
			
		}
		
		System.out.println("-------------------");
		Object arr1[] = new Object[6];
		arr1[0]="Hardik";
		arr1[1]=30;
		arr1[2]="Mumbai Indians";
		arr1[3]="27/04/1989";
		arr1[4]="Male";
		arr1[5]=180.25;
		
		for(int i=0;i<=5;i++) 
		{
			System.out.println(arr1[i]);
		}
		
		
		
		
	}
	

	public static void numberPattern() 
	{
		for(int i=0;i<=3;i++) 
		{
			for(int j=0;j<=9;j++) 
			{
				System.out.print(i+""+j+ " ");
			}
		System.out.println();
		}
	}
	
	public void q3Pattern() 

	{
		for(int i=4; i>=0;i--) 
		{
			System.out.println("n = " +i);
		}
	}
	
	public void colorsArrayList() 
	{
		ArrayList<String> str= new ArrayList<String>();
		str.add("Orange");
		str.add("Red");
		str.add("Green");
		str.add("Blue");
		str.add("Violet");
		str.add("Silver");
		System.out.println(str);
		
		//to insert an element into the array list at the first and last positions
		str.add(0, "Black");
		str.add(7, "Maroon");
		System.out.println(str);
		
		//to update specific array element by given element.Replacing 'Red' with 'Purple' at index 2
		str.set(2, "Purple");
		System.out.println(str);
	
		}
		
	public void colorsArrayListIndexBasis(int index) 
		{
			ArrayList<String> str= new ArrayList<String>();
			str.add("Orange");
			str.add("Red");
			str.add("Green");
			str.add("Blue");
			str.add("Violet");
			str.add("Silver");
			
			System.out.println(str);
		
			//to retrieve an element (at a specified index) from a given array list.
			for(int i=0;i<str.size();i++) {
					if(index==i) 
				{
					String value= str.get(i);
					System.out.println(value);
				}
					}
	

		
	}
	
	public static void deleteIndexBasedArrayElement(int index) 
	{
		ArrayList<String> str= new ArrayList<String>();
		str.add("Orange");
		str.add("Red");
		str.add("Green");
		str.add("Vibgyor");
		str.add("Violet");
		str.add("Silver");
		System.out.println(str);

		//to remove the third element from a array list. 
		for(int i=0;i<str.size();i++) 
		{
			if(index==i) 
			{
			str.remove(i);
			System.out.println(str);
			}
			
		}
}
	
	public static void searchArrayList(String name) 
	{
		ArrayList<String> ob= new ArrayList<String>();
		ob.add("Atif");
		ob.add("Naveen");
		ob.add("Shome");
		ob.add("Suraj");
		ob.add("Rohan");
		ob.add("Ravendra");
		System.out.println(ob);
	
		
		if(ob.contains(name)) 
		System.out.println("Person found");
		else
		System.out.println("Person not found");
	
	}
	
	public static void reverseArrayList() 
	{
		ArrayList<String> EmpList = new ArrayList<String>();

		EmpList.add("Tom");
		EmpList.add("Atif");
		EmpList.add("Naveen");
		EmpList.add("Peter");
		
		System.out.println(EmpList);
		
		Collections.sort(EmpList);
		
		System.out.println(EmpList);
		
		Collections.sort(EmpList, Collections.reverseOrder());
		System.out.println(EmpList);
	}
	
	public static void extractPortionArrayList() 
	{
		ArrayList<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  System.out.println("Original list: " + list);
		 
		//Sublist to ArrayList
		  List<String> sublist = list.subList(0, 2);
		  System.out.println(sublist);
	}
	
	public static void swapArrayElements() 
	{
		ArrayList<String> list = new ArrayList<String>();
		  list.add("Sachin");
		  list.add("Rahul");
		  list.add("Saurav");
		  list.add("Sunil");
		  list.add("Kapil");
		  System.out.println("ArrayList before Swap:");
		  System.out.println("Original list: " + list);
		  
		  Collections.swap(list, 2, 3);
		  System.out.println("ArrayList after Swap:");
		  System.out.println("Original list: " + list);
	}
	
	public static void emptyArrayList() 
	{
		ArrayList<String> list = new ArrayList<String>();
		  list.add("Sachin");
		  list.add("Rahul");
		  list.add("Saurav");
		  list.add("Sunil");
		  list.add("Kapil");
		  System.out.println(list);
		  
		  list.removeAll(list);
		  System.out.println(list);
		  
	}
	public static void trimArraySize() 
	{
		ArrayList<String> arr= new ArrayList<String>();
        arr.add("Red");
        arr.add("Green");
        arr.add("Black");
        arr.add("White");
        arr.add("Pink");
        System.out.println("Original array list: " + arr);
        
        arr.trimToSize();
        System.out.println(arr);
	}
	
	public static void printArrayElementsUsingPositions() 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		
	System.out.println("Original list all elements at once " + al);
		
		for (int i=0;i<al.size();i++) 
		{
			System.out.println(al.get(i));
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		//Q1
		AssignmentArrays.numberPattern();
		System.out.println("-------------------");
		//Q2
		AssignmentArrays.cricketData();
		System.out.println("-------------------");
		//Q3
		AssignmentArrays aa = new AssignmentArrays();
		aa.q3Pattern();
		System.out.println("-------------------");
		//ArrayList Q1. & Q2.
		aa.colorsArrayList();
		//Q4.
		aa.colorsArrayListIndexBasis(4);
		//Q5.
		deleteIndexBasedArrayElement(3);
		//Q6. 
		searchArrayList("Atif");
		//Q7.
		reverseArrayList();
		//Q8.
		extractPortionArrayList();
		//Q9.
		swapArrayElements();
		//Q10.
		emptyArrayList();
		//Q11.
		trimArraySize();
		//Q12.
		printArrayElementsUsingPositions();
		
		
		
	}

	
	
	
}

