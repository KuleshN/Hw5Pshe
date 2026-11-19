package task2;

/*
Условие:
В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
Примеры:
Собака гуляет и ест сухой корм
Кошка играет и ест влажный корм
Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.

Домашний петомец
  Собака
    гуляет
    ест корм
  Кошка
    ест влажный орм
    играет
Пет менеджер
 добавляет
 удаляет
 выгуливает
 играет
 */

public class Main {
    static void main() {
        Dog sharik = new Dog();
        Cat kuzya = new Cat();

        PetManager petya = new PetManager();
        petya.addedPet(sharik);
        petya.eatingPet();
        petya.addedPet(kuzya);
        petya.eatingPet();
        petya.playWithPet();
        petya.walkWithPet();
        petya.deletePet();
        petya.deletePet();
        petya.addedPet(sharik);
        petya.addedPet(kuzya);
        petya.playWithPet();
        petya.walkWithPet();



    }
}
