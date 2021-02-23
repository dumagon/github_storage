package generics_wildcards;

public class Animal {
   public int id;
   public int ur;
    public String name;

    public Animal(){}
    //// when we create our own constructor the default constructor ceases to exist
    //// and if we have a child class we have to create an identical constructor in the child class
    //// or we have to create a default constructor in the parent class !!!!!!!!

    public Animal(int id ,int ur,String name){
       this.id=id;
       this.ur=ur;
        this.name=name;
    }

    public void eat (){
        System.out.println("eat");
    }

    public String toString (){

        return String.valueOf(id);

    }



}
