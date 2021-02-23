package abstract_with_interfaces;

public abstract  class Bird implements Creator{

	@Override
     public void live(){
        System.out.println("I can live");
    }

    abstract void move();



}
