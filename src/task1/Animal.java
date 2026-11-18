package task1;

public abstract class Animal {

    private String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void move(){
        System.out.println();
    }

    public void sound(){
        System.out.println();
    }

}
