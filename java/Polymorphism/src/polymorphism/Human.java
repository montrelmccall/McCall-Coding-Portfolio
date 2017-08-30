package polymorphism;

public class Human extends Mammal {

	@Override
	public void communicate(){
		System.out.println("Uses Cell Phone");
	}
	
	@Override
	public void eat(){
		System.out.println("Uses chopsticks");
	}
	
	@Override
	public void move(){
		System.out.println("Uses cars");
	}
	
	@Override
	public void typeOfFur(){
		System.out.println("Scalp hair,facial hair, scattered body hair");
	}
	
}
