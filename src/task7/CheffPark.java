package task7;

public class CheffPark {

    Attractions attractions;

    public void addAtractions(Attractions attractions){
        this.attractions=attractions;
        System.out.println("Добавили аттракцион");

    }

    public void serviceAttraction(){
        this.attractions.info();
        this.attractions.service();

    }

}
