package task6;

public class Gardener {
    Plant plant;
    boolean plantAtService = false;

    public void addPlant(Plant plant){
        this.plant=plant;
        if(plantAtService==false){
            plantAtService=true;
            System.out.println("Добавили растение");
        }else {
            System.out.println("Садовник занят");
        }
    }

    public void servicePlant(){
        if(plantAtService==true){
        this.plant.watering();
        if (plant instanceof Shadowable){
            Shadowable shadowPlant = (Shadowable) this.plant;
            shadowPlant.giveShadow();
        }
        if (plant instanceof Sunable) {
            Sunable sunPlant = (Sunable) this.plant;
            sunPlant.giveSun();
        }
        }else{
            System.out.println("Нет растения");
        }
    }
    public void deletePlant(){
        if(plantAtService==true){
            plantAtService=false;
            System.out.println("Удалили растение");
        }else {
            System.out.println("Садовник и так занят");
        }
    }
    public void changeHumidity(Plant plant,int humidity){
        plant.setHumidity(humidity);
    }
}
