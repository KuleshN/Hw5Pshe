package task6;

public abstract class Plant {
    private int humidity;

    public int getHumidity(){
        return humidity;
    }

    public void setHumidity(int humidity){
        this.humidity=humidity;
    }

    public Plant(int humidity){
        this.humidity=humidity;
    }

    abstract void watering();
}
