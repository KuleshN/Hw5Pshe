package task1;
/*
1. Зоопарк
Условие:
В зоопарке есть одно животное, но оно может быть разным: птица или слон.
Каждое животное издаёт уникальные звуки и передвигается по-своему.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать с любым животным, добавлять его в зоопарк и демонстрировать его поведение.
Животное класс
  переменное имя
  метод звук
  метод передвижение
Слон
  Трубит
  Ходит
Птица
  чирикает
  летает

Зоопарк
   добавить животное
   демонстрация
   удалить животное

*/

public class Main {
    static void main() {
        Zoo osaka1 = new Zoo();
        Animal dambo = new Elephant("Dambo");
        Animal bird = new Bird("Pavlin-Mavlin");

        osaka1.addedAnimal(dambo);
        osaka1.demonstareAnimal();
        osaka1.deleteAnimal();
        osaka1.demonstareAnimal();
        osaka1.addedAnimal(bird);
        osaka1.demonstareAnimal();
    }
}
