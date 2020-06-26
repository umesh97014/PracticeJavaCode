package OopsConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//how to convert the string into integer
		String x = "100";
		System.out.println(x+20);
		
		//data conversion: string to integer
		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+20);
		
		//Integer, Double, Boolean
	    //String to double conversion:	
	    String y = "12.33";
	    double d = Double.parseDouble(y);
	    System.out.println(d+20);
	    
	    //String to Boolean
	    String b = "true";
	    boolean e = Boolean.parseBoolean(b);
	    System.out.println(e);
	    
	    //Int to String conversion:
	    int f = 200;
	    System.out.println(f+20);
	    String g = String.valueOf(f);
	    System.out.println(g);
	    System.out.println(g+20);
	    
	    String u = "100A";
	    Integer.parseInt(u);//number format exception--for input string "100A"
	    
	    
	

	}

}
