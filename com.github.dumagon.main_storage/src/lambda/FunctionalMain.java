package lambda;

import java.util.ArrayList;
import java.util.List;

interface StateChangeListener{
	 
	 
	 void stateListener(State newState,State oldState);
	
	
}
 
 
 class State {
	 int state=0;
	 
	 
	 
	 
	 public State(int num) {
		 
		 this.state=num;
	 }
 }
 
 
 class StateListenerOwner{
	 
	 List <Object> listeners=new ArrayList();
	 
	 public void addEventListener(StateChangeListener listener) {
		 
		 listeners.add(listener);
	 }
	 
 }


public class FunctionalMain {
	
	 static State state;
	
	public static void main(String[] args) {
		
		State oldS =new State(0);
		State newS =new State(1);
		
		

		StateListenerOwner slo =new StateListenerOwner();
		
		slo.addEventListener(new StateChangeListener() {
			
			@Override
			public void stateListener(State newState, State oldState) {
				
				
				System.out.println(" changes have occured"+newState);
			}
		});
		
		
	slo.addEventListener((newState,oldState)->{System.out.println(" change has occured");});
	
		
		
		
		
		
	}
	
	
	
	
	

}

















