package task8;

public class Manuscript extends Expo implements Humidityable{

    public Manuscript(String info){
        super(info);
    }

    @Override
    public void printInfo(){
        System.out.println(getInformation());
    }

    @Override
    public void controlHumidity(){
        System.out.println("Включим влажность");
    }
    @Override
    public void giveConditions() {
        controlHumidity();
    }
}
