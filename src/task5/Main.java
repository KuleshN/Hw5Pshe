package task5;
/*Условие:
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.
Примеры:
Корова даёт молоко, нуждается в выпасе
Курица несёт яйца, требует зерно
Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.

Animal
  giveProduct
  Cow
    giveProduct
    walkToGrazing
  Chiken
    giveProduct
    feedGrain
Interface walkToGrazing
Interface feedGrain

Fermer
  serviceAnimal
    giveprduct

*/

public class Main {
    static void main() {
        FermAnimal zabava = new Cow();
        FermAnimal ryaba = new Chiken();

        Farmer stepan = new Farmer();
        stepan.addedAnimal(zabava);
        stepan.serviceAnimal();
        stepan.addedAnimal(zabava);
        stepan.deleteAnimalFromFarmer();
        stepan.serviceAnimal();
        stepan.addedAnimal(ryaba);
        stepan.serviceAnimal();

    }
}
