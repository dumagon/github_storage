

class TestClass {
	
	public static void main(String[] args) {
		
	Print p =new Print();
		p.print();
		
		Print.More m = new Print().new More();
		

	}

}



 class Print{
	 
	 
	 public void print() {
		 
		 System.out.println("........");
		 
		 More m=new More();
		 m.printMore();
	 }
	
	 class More{
		 int a;
		
		private void printMore() {
			
			System.out.println("mmmmm");
		}
		
		
	}
	
}
