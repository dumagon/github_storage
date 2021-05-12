package threads.thread_local;

class SimpleTimeFormat{
	
	private String timeFormat=null;
	
	
	
	public SimpleTimeFormat(String time) {
		
		this.timeFormat=time;
	}
	
	
	public String getTimeFormat() {
		
		return this.timeFormat;
		
		
	}
	
	// sets a value and returns the reference of this value 
	
	public String setFormat(String time) {
		
		this.timeFormat=time;
		
		return this.timeFormat;
	}
	
	
	
	
	
	
}


class MyTimeFormatter{
	
	
	private ThreadLocal<SimpleTimeFormat> threadLocalSimpleDateFormat=new ThreadLocal<>();
	
	public String SetAndGetformat(String time) {
		
		SimpleTimeFormat simpleTimeFormat = getSimpleDateFormat();
		
		return simpleTimeFormat.setFormat(time);
		
		
	}
	
	
	
	
public String Getformat() {
		
		SimpleTimeFormat simpleTimeFormat = getSimpleDateFormat();
		
		return simpleTimeFormat.getTimeFormat();
		
		
	}
	
	
	public ThreadLocal<SimpleTimeFormat> getThreadLocalSimpleDateFormat() {
	return threadLocalSimpleDateFormat;
}




public void setThreadLocalSimpleDateFormat(ThreadLocal<SimpleTimeFormat> threadLocalSimpleDateFormat) {
	this.threadLocalSimpleDateFormat = threadLocalSimpleDateFormat;
}




	private SimpleTimeFormat getSimpleDateFormat() {
		
		SimpleTimeFormat simpleTimeFormat=threadLocalSimpleDateFormat.get();
		
		if(simpleTimeFormat==null) {
			
			simpleTimeFormat=new SimpleTimeFormat("hh:mm:ss");
			threadLocalSimpleDateFormat.set(simpleTimeFormat);}
		
		
		return simpleTimeFormat;
		
		
	};
	
	
	
	
	
}



public class LazySettingOfValue {
	
	public static void main(String[] args) {

		MyTimeFormatter myTime=new MyTimeFormatter();
		
		
		Thread thr =new Thread() {
			
			@Override
			public void run() {
                 
				String firstFormat =myTime.Getformat();
				String secondFormat=myTime.SetAndGetformat("SS:MM:HH:DD:YY");
				
				System.out.println(firstFormat+","+secondFormat);
			};
			
		};
		
		
		
		
		thr.start();
		
		try {
			
			
			Thread.sleep(2L*1000L);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		String firstFormat =myTime.Getformat();
		String secondFormat=myTime.SetAndGetformat("SS:MM:HH:DD");
		
		System.out.println(firstFormat+","+secondFormat);
		
		
	}

		
		
		
		
		
	}
























