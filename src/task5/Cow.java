package task5;

public class Cow extends FermAnimal implements WalkToGraizingable{

    @Override
    void giveProduct(){
        System.out.println("Даёт молоко");
    }

    @Override
    public void walkToGraizing(){
        System.out.println("Выпустили на выпас");

    }
}
