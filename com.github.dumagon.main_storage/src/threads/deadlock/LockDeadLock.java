package threads.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyRunnable1 implements Runnable{
	
	Lock lock1;
	Lock lock2;
	
	public  MyRunnable1(Lock lock1,Lock lock2) {
		
		this.lock1=lock1;
		this.lock2=lock2;
		
		
		
	
	
	}

	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		System.out.println(name+" attempting lock1");
		
		lock1.lock();
		System.out.println(name+" locked lock1");
		
		
		
       
		
		
		System.out.println(name+" attempting lock2");
		
		lock2.lock();
		System.out.println(name+" locked lock2");
		
		
		System.out.println(name+" unlocking lock1");
		lock1.unlock();
		System.out.println(name+" unlocking lock2");
		lock2.unlock();
		
	}
	
	
	
}
class MyRunnable3 implements Runnable{
	
	Lock lock1;
	Lock lock2;
	
	public  MyRunnable3(Lock lock1,Lock lock2) {
		
		this.lock1=lock1;
		this.lock2=lock2;
		
		
		
		
		
	}
	/// when executing this run() a thread will attempt locks in same sequence as the other threads do 
	
	
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		System.out.println(name+" attempting lock1");
		
		lock1.lock();
		System.out.println(name+" locked lock1");
		
		
		
		
		
		
		System.out.println(name+" attempting lock2");
		
		lock2.lock();
		System.out.println(name+" locked lock2");
		
		
		System.out.println(name+" unlocking lock1");
		lock1.unlock();
		System.out.println(name+" unlocking lock12");
		lock2.unlock();
		
	}
	
	
	
}

class MyRunnable2 implements Runnable{
	
	Lock lock1;
	Lock lock2;
	
	public  MyRunnable2(Lock lock1,Lock lock2) {
		
		this.lock1=lock1;
		this.lock2=lock2;
		
		
		
	
	
	}

	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		System.out.println(name+" attempting lock2");
		
		lock2.lock();
		System.out.println(name+" locked lock2");

		
		System.out.println(name+" attempting lock1");
		
		lock1.lock();
		System.out.println(name+" locked lock1");

		
		
		
		System.out.println(name+" unlocking lock2");
		lock2.unlock();
		System.out.println(name+" unlocking lock1");
		lock1.unlock();
	}
	
	
	
}








public class LockDeadLock {
	
	public static void main(String[] args) {
		
			

		Lock lock1 =new ReentrantLock();
		Lock lock2 =new ReentrantLock();
		
		MyRunnable1 myRunnable1=new MyRunnable1(lock1,lock2);
		MyRunnable2 myRunnable2=new MyRunnable2(lock1,lock2);
		MyRunnable3 myRunnable3=new MyRunnable3(lock1,lock2);
		
		
		Thread a =new Thread(myRunnable1,"a");
		Thread b =new Thread(myRunnable2,"b");
		Thread c =new Thread(myRunnable3,"c");
		
		
		a.start();
	    b.start();
		//c.start();  
		// this is how we would prevent the deadlock 
		
		
		
		
		
	}
	
	
	

}












