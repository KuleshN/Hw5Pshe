package task3;

/*Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.

Еда
поле нейм*
поле цена*
метод принт
 горячее блюдо
    температура
    принт
 напиток
    объём
    принт
шеф повар
  добавить блюдо
  принт блюдо + характеристика
  убрать блюдо

*/

public class Main {
    static void main() {
        Sheff shef = new Sheff();
        Food pirozhok = new HotFood("Кулебяка",3.30,30);
        Food cocaCola = new WaterFood("Coca-cola", 2.50,330);

        shef.addedInMenu(pirozhok);
        shef.printMenu();
        shef.addedInMenu(cocaCola);
        shef.printMenu();
        shef.deleteFoodFromMenu();
        shef.deleteFoodFromMenu();
        shef.deleteFoodFromMenu();
        shef.addedInMenu(cocaCola);
        shef.printMenu();
    }
}
