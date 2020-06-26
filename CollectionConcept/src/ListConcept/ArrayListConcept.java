package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		//int i[] = new int[4];//we donot use static array--because size is fixed
		//dynamic array--ArrayList
		//it can contain duplicate values/elements
		//it inserts the value in ordering - maintain insertion order
		//it is not synchronized
		//allows random access to fetch any element -- stores the values on the basis of indexes
		ArrayList ar = new ArrayList();//not generic
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add("Tom");//3
		ar.add(40);//4
		ar.add('U');//5
		ar.add(45.35);//6
		ar.add(40);//7
		
		System.out.println(ar.size());//size of array list
		System.out.println(ar.get(5));//to get the value from an index
		
		//to print all the values from arraylist along with array index: 
		//Using For loop or 
		//using iterator
		for(int i=0;i<ar.size();i++) {
			System.out.println(i);	
			System.out.println("*****************");
			System.out.println(ar.get(i));
			
					}
		//non generic Vs generic:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();//generic: as '<Integer>' is defined
		//ar1.add("Tom");//Not allowed
		ar1.add(1000);
		ar1.add(2000);
		System.out.println(ar1.size());
		System.out.println(ar1.get(0));
		
		ArrayList<E> ar2 = new ArrayList<E>();
				
		//user defined class can also be used in ArrayList
		//Employee class object
		Employee e1 = new Employee("Umesh", 34, "QA");
		Employee e2 = new Employee("Naveen", 30, "Dev");
		Employee e3 = new Employee("Rahul", 32, "Admin");
		
		//Create ArrayList:
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//Iterator it = (Iterator) ar3.iterator();//check not working
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		}
		
		//*************
		//addall()
		ArrayList ar4 = new ArrayList();
		ar4.add("Dev");
		ar4.add("QA");
		ar4.add("Admin");
		
		ArrayList ar5 = new ArrayList();
		ar5.add("JAVA");
		ar5.add("Selenium");
		ar5.add("IT");
		
		ar5.addAll(ar4);
		System.out.println(ar5.size());
		System.out.println(ar5.get(3));
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("**************");
		
		//removeAll
		ar5.removeAll(ar4);
		
		System.out.println(ar5.size());
		System.out.println(ar5.get(1));
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("+++++++++++++++++");
		
		//retainAll()
		ArrayList ar6 = new ArrayList();
		ar6.add("Dev");
		ar6.add("QA");
		ar6.add("Admin");
		
		ArrayList ar7 = new ArrayList();
		ar7.add("Dev");
		ar7.add("Selenium");
		ar7.add("Admin");
		
		ar6.retainAll(ar7);
		for(int i=0;i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
	}
}