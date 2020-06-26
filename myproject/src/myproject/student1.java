package myproject;

public class student1 {
	//Constructors
		String studentName;
		public student1(String name) {
			studentName = name;
		}
		
		public String getName() {
			return studentName;
		}
		
		public void saying() {
			System.out.println("Your name is " + studentName);
		}
}
