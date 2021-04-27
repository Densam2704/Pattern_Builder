import builders.KFCBuilder;
import builders.McDonaldsBuilder;
import dircetor.Director;
import menu.Drink;
import orders.McDonaldsOrder;

public class Main {
  
  public static void main(String[] args) {
    Director director = new Director();
    
    McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();
    KFCBuilder kfcBuilder = new KFCBuilder();
  
    //Without using director class
    System.out.println(" make mcdonalds order without director");
    mcDonaldsBuilder.orderBurger(1);
    mcDonaldsBuilder.orderDrinks(2);
    System.out.println();
    
    //Using director class to build
    System.out.println(" make kfc order with director");
    director.makeOrder1(kfcBuilder);
    System.out.println(" make mcdonalds order with director");
    director.makeOrder2(mcDonaldsBuilder);
  
    //Using built order
    McDonaldsOrder order = mcDonaldsBuilder.getResult();
    System.out.println("The last ordered burger in mcdonalds was "+order.getBurger());
  }
  
  
  
}
