package task3;

public class HotFood extends Food{
    double temp;

   public HotFood(String name, double price, double temp){
       super(name, price);
       this.temp=temp;
   }

    @Override
    public void print(){
        System.out.println("Это "+ getName() + " горячая еда с темературой" + temp +" k и цена: "+getPrice()+"$");
    }
}
