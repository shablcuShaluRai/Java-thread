
public class MyThread  extends Thread{

	
	public void run(){
		
		
		for(int i=0;i<10000;i++){
			
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		MyThread mythread=new MyThread();
		
		Thread thread=new Thread(mythread);
		
		thread.start();

	}

		
	

}
