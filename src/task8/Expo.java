package task8;

public abstract class Expo {
   private String information;

    public Expo(String information){
        this.information=information;
    }
    public String getInformation(){
        return information;
    }

    abstract void printInfo();

    abstract void giveConditions();


}
