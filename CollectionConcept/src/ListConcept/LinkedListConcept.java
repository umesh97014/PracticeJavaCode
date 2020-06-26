package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFP");
		//print
		System.out.println("Content of LinkedList: " + ll);
		
		//add First:
		ll.addFirst("Naveen");
		
		//add Last:
		ll.addLast("Umesh");
		
		//print
		System.out.println("Content of LinkedList: " + ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Automation");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of LinkedList: " + ll);
		
		//remove from index
		ll.remove(2);
		System.out.println("Content of LinkedList: " + ll);
		
		//how to print all the values of linked list:
		//for loop
		System.out.println("==========using for loop");
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		//advance for loop
		System.out.println("==========using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		
		//iterator
		System.out.println("==========using iterator for loop");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//while loop
		System.out.println("==========using While loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		

	}

}
