package task4;

public class AquaManager {
    SeaAnimal seaAnimal;
    boolean animalInAquarium = false;

    public void addedAnimal(SeaAnimal seaAnimal){
        if(animalInAquarium == false){
            animalInAquarium = true;
            this.seaAnimal=seaAnimal;
            System.out.println("Добавлено животное");
        }else{
            System.out.println("Аквариум занят");
        }
    }
    public void deleteAnimal(){
        if(animalInAquarium==true){
            animalInAquarium=false;
            System.out.println("Животное убрали из квариума");
        }else{
            System.out.println("Аквариум и так пустой");
        }
    }
    public void demonstrateAnimal(){
       if(animalInAquarium==true) {
           this.seaAnimal.move();
       }else{
           System.out.println("Никого нет в аквариуме");
       }
    }
}
