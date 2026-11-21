package task3;

public class Sheff {
    Food food;
    boolean foodInMenu = false;

    public boolean addedInMenu(Food food){
        if(foodInMenu==false){
            foodInMenu=true;
            this.food=food;

        }else{
            System.out.println("В меню уже есть блюдо");
        }
        return foodInMenu;
    }
    public void deleteFoodFromMenu(){
        if(foodInMenu == true){
            foodInMenu=false;
        }else{
            System.out.println("В меню нет еды");
        }
    }
    public void printMenu(){
        if (foodInMenu == true){
            food.print();
        }else{
            System.out.println("В меню нет блюда");
        }

    }

}
