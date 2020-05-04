package co.edureka.threads;
class MyTask2 extends Thread
{
	public void run() {
	 display();	
	}
	static void display() 
	{
	 Thread t = Thread.currentThread();
	 System.out.println(t);
	}
}
public class ThreadTest2 
{
	public static void main(String[] args) 
	{
	 System.out.println("No of Active Threads = "+ Thread.activeCount());
	 Thread t = Thread.currentThread();
	 System.out.println(t);
	 /*create a thread*/
	 MyTask2 task = new MyTask2();
	 /*make thread runnable*/
	 task.start();
	 
	 System.out.println("No of Active Threads = "+ Thread.activeCount());
	}
}
