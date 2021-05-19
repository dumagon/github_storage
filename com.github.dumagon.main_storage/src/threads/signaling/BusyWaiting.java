package threads.signaling;

class MySignals{
	
	private boolean hasDataToProcess=false;

	public boolean isHasDataToProcess() {
		return hasDataToProcess;
	}

	public void setHasDataToProcess(boolean hasDataToProcess) {
		this.hasDataToProcess = hasDataToProcess;
	}
	
	
	
	
}



public class BusyWaiting {
	
	
	public static void main(String[] args) {

		
		MySignals mySignal=new MySignals();
		
		 
		Thread a1 =new Thread() {
			
			
			@Override
			public void run() {

			int i=0;
			
		while(i<10) {
			
			
			try {
				
				Thread.sleep(20L);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			i++;
		}
				
		mySignal.setHasDataToProcess(true);
				
			};
			
		};
		
		
		Thread b1=new Thread() {
			
			@Override
			public void run() {
				
				while(!mySignal.isHasDataToProcess()) {
                  // do nothing / busy waiting 
					
					System.out.println("busy waiting");
			};
			
			System.out.println("the data is ready to process");
		};
		
		
	};
	
	
	a1.start();
	b1.start();
	

}

}


















