import java.util.concurrent.locks.ReentrantLock;
public class syncCode {
	
	
	private static int count;
	
	public static void count(String str){
		
		while(count < 1000){
			{
				increase(str);
			}
		}
		
	}
	
	private static synchronized void increase(String str){
		System.out.println(str+ " has this. One at a time: " + count++);
	}

}
