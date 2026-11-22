package task6;

public class Orchid extends Plant implements Shadowable{

    public Orchid(int humidity){
        super(humidity);
    }

    @Override
    public void watering(){
        System.out.println("Включаем полив: "+getHumidity()+" влажности");
    }
    @Override
    public void giveShadow(){
        System.out.println("Создадим тень");
    }
}
