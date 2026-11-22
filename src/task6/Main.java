package task6;
/*Условие:
В ботаническом саду содержится одно растение.
У разных растений — разные требования к уходу.
Орхидея — высокая влажность и тень
Кактус — много света, редкий полив
Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
Растения
  полив()
    Орхидея
      полив()
      и.тень
    Кактус
     полив()
     и.свет
И. Сделать тень
И. Сделать свет
Гарден
  уход()
    полив
    или свет, или тень

  добаляться
  уход за растением
*/



public class Main {
    static void main() {
        Plant orchid1 = new Orchid(70);
        Plant cactus1 = new Cactus(30);
        Gardener ivan = new Gardener();

       ivan.addPlant(orchid1);
       ivan.servicePlant();
       ivan.changeHumidity(orchid1,50);
       ivan.servicePlant();
    }
}
