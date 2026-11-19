package task2;

public class PetManager {
 Pet pet;
 boolean petWithPetManager = false;

    public void addedPet(Pet pet){
        if(petWithPetManager == false){
       this.pet = pet;
        petWithPetManager = true;
            System.out.println("Животное добавлено");
        }
        else{
            System.out.println("Удали животное прежде чем добавить новое");
        }

    }
    public boolean deletePet(){
        if(petWithPetManager == true){
           petWithPetManager = false;
        }else{
            System.out.println("Петменеджер свободный можешь добавить животное");
        }
        return false;
    }
    public void eatingPet(){
        this.pet.eating();


    }
    public void playWithPet(){
       if(this.pet instanceof Playeble){
          Playeble playeblePet = (Playeble) this.pet;
           System.out.println("Животное играет");
       }
       else {
           System.out.println("Животное не играет");
       }
    }
    public void walkWithPet(){
        if(this.pet instanceof Walkable){
            Walkable walkablePet = (Walkable) this.pet;
            System.out.println("Животное гуляет");
        }else{
            System.out.println("Животное не гуляет");
        }

    }
}
