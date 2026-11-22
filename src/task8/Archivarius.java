package task8;

public class Archivarius {
    Expo exponation;

    public void addedExpo(Expo exponation){
        this.exponation=exponation;
        System.out.println("Добавили экспонат");
    }
    public void presentExpo(){
        this.exponation.printInfo();
        this.exponation.giveConditions();
    }

}
