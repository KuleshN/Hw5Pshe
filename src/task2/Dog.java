package task2;

public class Dog extends Pet implements Walkable{


    @Override
    public void eating(){
        System.out.println("ест сухой корм");
    }

    @Override
    public void walk(){
        System.out.println("Гуляет");
    }
}
