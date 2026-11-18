package task1;

public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println(getName()+ " птичка летает");
    }
    @Override
    public void sound(){
        System.out.println(getName()+" птичка чирикает");
    }
}
