package OopsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism -- compile time polymorphism
		BMW b = new BMW();
		b.start();//overirdden
		b.stop();//Inherit from parent class
		b.refuel();//Inherit from parent class
		b.theftsafety();//
		b.engine();
		
		System.out.println("********************");
		Car c = new Car();
		c.start();
		c.stop();
        c.refuel();
        c.engine();
        
        System.out.println("************************");
        
        //Top casting
        Car c1 = new BMW();//child class object can be referred by parent class reference variable -- dynamic polymorphism -- or run-time polymorphism
        c1.start();
        c1.stop();
        c1.refuel();
        c1.engine();
        
        //Down casting
        BMW b1 = (BMW) new Car();//not allowed -- in runtime it will give class cast exception
        

	}

}
