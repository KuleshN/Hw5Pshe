package task8;
/*
* Условие:
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.
Примеры:
Манускрипт — требует контролируемой влажности
Скульптура — нуждается в реставрации
Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
*/

public class Main {
    static void main() {
        Expo manuscript1 = new Manuscript("Кодекс Хамурапи, 10ый век д.н.э");
        Expo davidik = new Sculpture("Давид, автор Миккеланджело 15 век");
        Archivarius akakiKurolesov = new Archivarius();

        akakiKurolesov.addedExpo(manuscript1);
        akakiKurolesov.presentExpo();
        akakiKurolesov.addedExpo(davidik);
        akakiKurolesov.presentExpo();
    }
}
