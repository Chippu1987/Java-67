package co.edureka.threads;
class Natural extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

class Even extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+(i*2));
		}
	}
}

public class ThreadTest3
{
	public static void main(String[] args) 
	{
	 Natural nat = new Natural();
	 Even eve = new Even();
	 
	 nat.setName("Natural");
	 eve.setName("Even   ");
	 
	 nat.start();
	 eve.start();
	}
}
