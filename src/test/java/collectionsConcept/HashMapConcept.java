package collectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapConcept {

	public static void main(String[] args) {

		
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		namesList.add("Perl");
		namesList.add("Csharp");
		
		
		
		// add, remove  - we dont need explicit syncronization
		
		//to fetch/traverse the values from this list -- we have to use explicit synchroniation
		
		synchronized (namesList) {
			
			Iterator<String> it =namesList.iterator();
			while(it.hasNext()) 
			{
				System.out.println(it.next());
			}
			
		}
		
		
		//2. Its a class - thread safe/synchronized already.
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		
		//We dont need explicit synchronization for add, remove , traverse
		
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
