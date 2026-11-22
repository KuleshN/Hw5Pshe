package task6;

public class Cactus extends Plant implements Sunable{

    public Cactus(int humidity){
        super(humidity);
    }

    @Override
    public void watering(){
        System.out.println("Включаем полив: "+getHumidity()+" влажности");
    }

    @Override
    public void giveSun(){
        System.out.println("Добавим свет");
    }
}
