package polymorphism;

public class Cat extends Mammal{
	
	@Override
	public void communicate(){
		System.out.println("Meow");
	}
	
	@Override
	public void eat(){
		System.out.println("Nom Nom Nom");
	}
	
	@Override
	public void move(){
		System.out.println("Four paws");
	}
	
	@Override
	public void typeOfFur(){
		System.out.println("Fur all over body");
	}
	

}
