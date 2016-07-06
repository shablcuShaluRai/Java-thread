import java.io.IOException;


public class Stopthread  {

	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		MyThread1 mt=new MyThread1();
		Thread t=new Thread(mt);
		t.start();
		// stop the thread when enter key is pressed
		System.in.read();
		mt.stop=true;
		

	}

	

}
