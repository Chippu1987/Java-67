package co.edureka.threads;

public class MainThreadTest 
{
	public static void main(String[] args) 
	{
	 int n = Thread.activeCount();
	 System.out.println("No of Active Threads = "+ n);
	 
	 Thread t = Thread.currentThread();
	 System.out.println(t);
	 
	 System.out.println(t.getName());
	 System.out.println(t.getPriority());
	 ThreadGroup tgp = t.getThreadGroup();
	 System.out.println(tgp);
	 
	 t.setName("edureka");
	 t.setPriority(11);
	 System.out.println(t);
	}
}
