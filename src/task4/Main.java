package task4;
/*Условие:
В аквариуме может находиться одно морское существо.
В зависимости от существа, оно ведёт себя по-разному.
Примеры:
Акула плавает быстро и агрессивно
Морская звезда медленно ползает
Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.

Морские животные
 move()
  Акула
    move() плавает
  Звезда
    move() ползает
Аква мэнеджер
   add
   delete
   demonstrate

*/

public class Main {
    public static void main(){
        SeaAnimal chews = new Shark();
        SeaAnimal starlight = new StarFish();
        AquaManager lebowski = new AquaManager();

        lebowski.addedAnimal(chews);
        lebowski.demonstrateAnimal();
        lebowski.addedAnimal(starlight);
        lebowski.deleteAnimal();
        lebowski.deleteAnimal();
        lebowski.demonstrateAnimal();
    }
}
