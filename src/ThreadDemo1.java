
public class ThreadDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread1 mt=new MyThread1();
		
		Thread t=new Thread(mt);
		t.start();

	}

}
