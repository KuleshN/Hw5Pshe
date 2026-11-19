package task2;

public class Cat extends Pet implements Playeble{

    @Override
    public void eating(){
        System.out.println("Ест влажный корм");
    }

    @Override
    public void play() {
        System.out.println("Играет");
    }
}
