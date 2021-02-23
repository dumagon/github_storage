package super_in_classes;

public class Animal {

    private String breed;
    private int weight;

    Animal(){}

    Animal(int weight,String breed){
        this.breed=breed;
        this.weight=weight;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }
}
