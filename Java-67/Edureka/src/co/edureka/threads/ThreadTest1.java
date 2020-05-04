package co.edureka.threads;
class MyTask1 implements Runnable
{
 public void run() 
 {
   Thread t = Thread.currentThread();
   System.out.println(t);
 }
}

public class ThreadTest1 
{
 public static void main(String[] args) throws InterruptedException 
 {
   System.out.println("No of Active Threads = "+ Thread.activeCount());
   Thread t = Thread.currentThread();
   System.out.println(t);
   
   /*create a Runnable object*/
   MyTask1 task = new MyTask1();
   /*create a Thread for Runnable object*/
   Thread ct = new Thread(task);
   /*make the Thread runnable*/
   ct.start();
   Thread.sleep(500);
   System.out.println("No of Active Threads = "+ Thread.activeCount());
 }
}
