package polymorphism;

public class Snake extends Reptile{

	@Override
	public void communicate(){
		System.out.println("Hiss");
	}
	
	@Override
	public void eat(){
		System.out.println("Fangs to the face");
	}
	
	@Override
	public void move(){
		System.out.println("Slither");
	}
	
	@Override
	public void typeOfScales(){
		System.out.println("Slick and smooth");
	}
	
	
	

}
