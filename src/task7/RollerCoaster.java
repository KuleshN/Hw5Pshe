package task7;

import java.security.PublicKey;

public class RollerCoaster extends Attractions implements CheckSecurity{

    public RollerCoaster(){
        super("Быстрый аттрацион");
    }

    @Override
    public void info(){
        System.out.println(getInformation());
    }

    @Override
    public void checkSecurity(){
        System.out.println("Проверка безопасности");
    }

    @Override
    public void service(){
        checkSecurity();
    }
}
