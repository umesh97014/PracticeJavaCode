package abstractClass;

abstract class animal {
	abstract void soundOfanimal();  // It is just an idea
	}
	 
	class Cat extends animal
	{
	    void soundOfAnimal()
	    {
	        System.out.println("Meoh");
	        //Implementation of the idea according to requirements of sub class
	    }

		@Override
		void soundOfanimal() {
			// TODO Auto-generated method stub
			
		}
	}
	 
	class Dog extends animal
	{
	    void soundOfAnimal()
	    {
	        System.out.println("Bow Bow");
	        //Implementation of the idea according to requirements of sub class
	    }

		@Override
		void soundOfanimal() {
			// TODO Auto-generated method stub
			
		}

}
