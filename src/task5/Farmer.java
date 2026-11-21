package task5;

public class Farmer {
    private FermAnimal animal;
    boolean animalInJob = false;

    public void addedAnimal(FermAnimal animal) {
        if (animalInJob == false) {
            this.animal = animal;
            animalInJob = true;
            System.out.println("Взял в работу");
        } else {
            System.out.println("Фермер занят");
        }
    }

    public void deleteAnimalFromFarmer() {
        if (animalInJob == true) {
            animalInJob = false;
        } else {
            System.out.println("Фермер отдыхает");
        }
    }

    public void serviceAnimal() {
        if (animalInJob == true) {
            this.animal.giveProduct();
            if (animal instanceof WalkToGraizingable) {
                WalkToGraizingable fermAnimal = (WalkToGraizingable) this.animal;
                fermAnimal.walkToGraizing();
            } else if (animal instanceof FeedGrain) {
                FeedGrain fermAnimal = (FeedGrain) this.animal;
                fermAnimal.feedGrain();
            } else {
                return;
            }
        } else {
            System.out.println("Животного нет у фермера");
        }
        {

        }

    }
}
