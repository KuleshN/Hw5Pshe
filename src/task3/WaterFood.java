package task3;

import task2.Walkable;

public class WaterFood extends Food{
    int volume;

    public WaterFood(String name, double price, int volume){
        super(name,price);
        this.volume=volume;
    }


    @Override
    public void print(){
        System.out.println("Это "+ getName() + " напиток объёмом" + volume +" ml и цена: "+getPrice()+"$");
    }
}
