package thread;
class MyThread implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	
	}
}
class MyThread1 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class TreadTest1 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.activeCount());
		
		MyThread mt = new MyThread();
		Thread ct = new Thread(mt); // creating a new thread for that object
		//ct.start();
		//System.out.println(ct);
		//System.out.println(ct.activeCount());
		
		MyThread1 ct1 = new MyThread1();
		
		ct.start();
		ct1.start();
	
		System.out.println(ct1);
		System.out.println(ct1.activeCount());
	}
}
