package task1;

public class Zoo {
    Animal animal1;
    boolean animalInZoo = false;

    public boolean addedAnimal(Animal animal){
        animal1 = animal;
        return animalInZoo = true;

    }
    public boolean deleteAnimal(){
        return animalInZoo = false;

    }
    public void demonstareAnimal(){
        if(animalInZoo==true){
            animal1.move();
            animal1.sound();
        }else{
            System.out.println("В зоопарке никого нет");
        }
    }
}
