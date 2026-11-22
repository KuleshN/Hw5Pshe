package task7;

public class Courusel extends Attractions implements TechService {

    public Courusel() {
        super("Медленный аттракцион");
    }

    @Override
    public void info() {
        System.out.println(getInformation());
    }

    @Override
    public void techService() {
        System.out.println("Техническая проверка");
    }

    @Override
    public void service() {
        techService();
    }
}
