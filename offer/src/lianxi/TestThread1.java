package lianxi;

public class TestThread1 {

	public static void main(String[] args) {
		Runner1 r=new Runner1();
		Thread t=new Thread(r);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("主线程："+i);
		}
	}
	
}
class Runner1 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("子线程："+i);
		}
	}
	
}
