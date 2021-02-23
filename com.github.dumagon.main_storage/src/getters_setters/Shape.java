package getters_setters;

public class Shape {

    private int length;
    private long height;
    public double square;

    public Shape(){}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
    public void view (){

        System.out.println("height is "+height);
        System.out.println("length is "+length);

    }
}
