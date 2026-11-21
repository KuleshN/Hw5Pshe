package task5;

import java.sql.SQLOutput;

public class Chiken extends FermAnimal implements FeedGrain{

    @Override
    void giveProduct(){
        System.out.println("Несёт яйца");
    }

    @Override
    public void feedGrain(){
        System.out.println("Кормим зерном");
    }
}
