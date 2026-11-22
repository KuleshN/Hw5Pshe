package task7;
/*В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
Примеры:
Американские горки — проверка безопасности
Карусель — техническое обслуживание
Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.

Attractions
 инфо
 сервис()
   RollerCoaster
   инфо
   проверка безопасности
   Courusel
    инфо
    техническое обслуживнаие
Technic
И проверка безопасности
И техническое обслуживнаие


*/

public class Main {
    static void main() {
        Attractions americanRoller = new RollerCoaster();
        Attractions karusel = new Courusel();
        CheffPark semen = new CheffPark();

        semen.addAtractions(americanRoller);
        semen.serviceAttraction();
        semen.addAtractions(karusel);
        semen.serviceAttraction();
    }
}
