package lambda;


interface In1{public void doSome(String string);}

interface In2{public void doSome(Integer integer1,Integer integer2);}

interface In3{public void writeSome();}

interface In4{
	
	static void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public String stringReturner(String string);
	
	default void write() {
		
		System.out.println("this is the default method");
	}
	
	



}




public class LambdaMain {
	
	static void excecute(In3 n3) {
		
		n3.writeSome();
	}
	
	
	
	public static void main(String[] args) {

	
	excecute(()->{System.out.println("hoo");});
	
	In1[] arr =new In1[10];
	
	arr[0]=(param)->{System.out.println("boo"+param);};
	
	In1 n1 =arr[0];
	n1.doSome("goo");
	
	
	In1 n11= (par)->{System.out.println(par);};
	
	In2 n22 =(a,b)->{Integer inter =a>b?a:b; System.out.println(inter); };
	
	In3 n33 =()->{System.out.println("nothing");};
	
	In4 n44 =(par)->par;
	
	n11.doSome("noo");
	n22.doSome(2, 4);
	n33.writeSome();
	
	String rt = n44.stringReturner("this is to be returned ");
	
	System.out.println(rt);
	
	In4.add(5, 9);
	
	n44.write();
	
	
	
	
	
		
		
		
		
		
		
		
	}

}
