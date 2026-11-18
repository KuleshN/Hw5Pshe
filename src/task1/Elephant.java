package task1;

public class Elephant extends Animal{

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void move(){
        System.out.println(getName()+" Слон ходит");
    }
    @Override
    public void sound(){
        System.out.println(getName()+" Слон трубит");
    }

}
