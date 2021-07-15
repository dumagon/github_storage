package threads.locks;

import java.util.HashMap;
import java.util.Map;

class ReadWriteReentrantLocker {
 
	
	private Map<Thread,Integer>readingThreads=new HashMap<>();
	
	private int writeAccess=0;
	
	private int writeRequests=0;
	
	private Thread writingthread=null;
	
	
	
	public synchronized void lockRead() throws InterruptedException {
		
		Thread callingThread=Thread.currentThread();
		
       while(!canGetReadAccess(callingThread)) {
			
			wait();
			
		}
		
		readingThreads.put(callingThread, readAccessCount(callingThread)+1);
		
		
		
		
	}
	
	
	public synchronized void unlockRead() {
		
		Thread callingThread = Thread.currentThread();
		
		if(!isReader(callingThread)) {
			
			throw new IllegalMonitorStateException(" calling thread does not hold the lock ");
		}
		
		int AccessCount = readingThreads.get(callingThread);
		
		if(AccessCount==1) {
			
			readingThreads.remove(callingThread);
		}else {
			
			readingThreads.put(callingThread, readAccessCount(callingThread)-1);
		}
		notifyAll();
	}
	
	
	
	
	
	
	
	
	
	
	public synchronized void lockWrite() throws InterruptedException{
		
		writeRequests++;
		
		Thread callingThread=Thread.currentThread();
		
		while(!canGetWriteAccess(callingThread)) {
			
			wait();
		}
		
		writeRequests--;
		writeAccess++;
		
		writingthread=callingThread;
		
		
		
	}
	
	
	public synchronized void unlockWrite() {
		
		Thread callingThread = Thread.currentThread();
		
		if(!isWriter(callingThread)) {
			
			throw new IllegalMonitorStateException(" calling thread does not holds the lock");
			
		}
		
		writeAccess--;
		
		if(writeAccess==0) {
			
			writingthread=null;
		}
		
		notifyAll();
		
	}
	
	
	
	
     private boolean canGetReadAccess(Thread callingThread) {
		
		if(isWriter(callingThread))return true;
		if(hasWriter())return false;
		if(isReader(callingThread))return true;
		if(hasWriteRequest())return false;
		return true;
		
		
		
	}
    
    
    
    
     private int readAccessCount(Thread callingThread) {
		
		Integer accessCount=readingThreads.get(callingThread);
		
		
		if(accessCount==null)return 0;
		
		return accessCount.intValue();
		
	}
	
	
	
	
	
	
	private boolean canGetWriteAccess(Thread callingThread) {
		
		if(isTheOnlyReader(callingThread)) return true;
		if(hasReader()) return false;
		if(!hasWriter()) return true;
		if(!isWriter(callingThread)) return false;
		return true;
		
		
		
	}
	
	private boolean hasReader() {
		
		return readingThreads.size()>0;
	}
	
	
	
	private boolean isReader(Thread callingThread) {
		
		if(readingThreads.get(callingThread)!=null) return true;
		
		return false;
		
	}
	
	
	private boolean isTheOnlyReader(Thread callingThread) {
		
		return readingThreads.size()==1 && readingThreads.get(callingThread)!=null;
		
	}
	
	
	
	private boolean isWriter(Thread callingThread) {
		
		
	return writingthread==callingThread;
		
	}
	
	
	
	private boolean hasWriter() {
		
		return writingthread==null;
		
	}
	
	
	
	private boolean hasWriteRequest() {
		
		return writeRequests>0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
