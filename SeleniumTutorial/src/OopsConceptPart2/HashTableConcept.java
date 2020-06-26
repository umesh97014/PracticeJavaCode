package OopsConceptPart2;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, "Marvel");
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		//to restrict
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		//h1.put("A", "Spider"); ---> Not allowed
		//h1.put("A", 700); ---> Not allowed
		h1.put(4, 300);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(5, "Excellent");
		//h2.put(6, 400); ---> Not allowed
		
		

	}

}
