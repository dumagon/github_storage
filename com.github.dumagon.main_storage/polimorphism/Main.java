package polimorphism;

public class Main {




    public static void main(String[] args) {

        Bird o =new Ostrich();
        Bird p=new Penguin();
        Bird s =new Swallow();
        Bird l =new Crow();
        Bird [] arr ={o,p,s,l};
        for (Bird temp:arr) {
            temp.move();
        }





    }
}
