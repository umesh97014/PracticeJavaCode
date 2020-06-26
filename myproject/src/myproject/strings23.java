package myproject;

public class strings23 {

	public static void main(String[] args) {
		// Strings
		String str = "Hello World";
		System.out.println(str);
		
		//To find the length of the string
		int strlength = str.length();
		System.out.println("The string length is " + strlength);
		
		//To get displayed in upper case for the string
		String strInUpperCase = str.toUpperCase();
		System.out.println("The string upper case are as follows " + strInUpperCase);
		
		//To get displayed in lower case for the string
		String strInLowerCase = str.toLowerCase();
		System.out.println("The string upper case are as follows " + strInLowerCase);
		
		//To get replaced the character for the string
         	
		System.out.println("Replace the character in the string " + str.replace('o', 'a'));
	}

}
