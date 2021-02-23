package constructors_overload;

public class Animal {
    private int height;
    private  int age;

    public Animal (int height,int age){

        this.height=height;
        this.age=age;
    }

    public Animal(){

        this(78,34);

    }

    public Animal (int age){

        this.height=56;
        this.age=age;


    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
