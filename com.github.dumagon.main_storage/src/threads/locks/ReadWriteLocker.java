package threads.locks;

public class ReadWriteLocker {
	
	private int writers=0;
	private int writeRequests=0;
	private int readers=0;
	
	public void readLock() throws InterruptedException{
		
		while(writers>0 ||writeRequests>0) {
			
			this.wait();}
		
		readers++;
		
		
	}
	
	
	public void unlockRead() {
		
		readers--;
		
    	this.notifyAll();
		
		
	}
	
	public void lockWrite() throws InterruptedException {
		
		writeRequests++;
		
		while(writers>0 && readers>0) {
			
			this.wait();
			
		}
		
		writeRequests--;
		writers--;
		
		
		
	}
	
	public void unlockWrite() {
		
		writers--;
		this.notifyAll();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
