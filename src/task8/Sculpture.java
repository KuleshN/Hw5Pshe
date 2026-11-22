package task8;

public class Sculpture extends Expo implements Restorationable{

    public Sculpture(String info){
        super(info);
    }
    @Override
    public void printInfo(){
        System.out.println(getInformation());
    }

    @Override
    public void giveResto(){
        System.out.println("Отреставрируем");
    }
    @Override
    public void giveConditions() {
        giveResto();
    }
}
