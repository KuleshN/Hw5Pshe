package task7;

public abstract class Attractions {
    String information;
    public Attractions(String information){
        this.information=information;
    }

    public String getInformation(){
        return information;

    }
    abstract void info();

    abstract void service();
}
