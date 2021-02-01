import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Atif");
		hm.put("B", "Naveen");
		hm.put("C", "Kasif");
		hm.put("D", "Mumma");
		hm.put("E", "Mumma");
		hm.put("F", "Mumma");
		hm.put("G", "Mumma");
		hm.put("H", "Mumma");
		hm.put("I", "Mumma");
		hm.put("J", "Mumma");
		hm.put("K", "Mumma");
		hm.put("L", "Mumma");
		hm.put("M", "Mumma");
		hm.put("N", "Mumma");
		hm.put("O", "Mumma");
		hm.put("P", "Mumma");
		
		hm.put("Q", "Mumma");
		
		System.out.println(hm);
		
		System.out.println(hm.get("B"));
		
		System.out.println(hm.size());
		
	}

}
