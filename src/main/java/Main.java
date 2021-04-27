import builders.KFCBuilder;
import builders.McDonaldsBuilder;
import dircetor.Director;
import menu.Drink;
import orders.McDonaldsOrder;

//Inspired by https://refactoring.guru/ru/design-patterns/builder

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
    System.out.println(" make kfc order 1 with director");
    director.makeOrder1(kfcBuilder);
    System.out.println();
    
    System.out.println(" make mcdonalds order 1 with director");
    director.makeOrder1(mcDonaldsBuilder);
    System.out.println();
  
    System.out.println(" make mcdonalds order 2 with director");
    director.makeOrder2(mcDonaldsBuilder);
    System.out.println();
  
    System.out.println(" make mcdonalds order 3 with director");
    director.makeOrder3(mcDonaldsBuilder);
    System.out.println();
  
    //Using built order
    McDonaldsOrder order = mcDonaldsBuilder.getResult();
    System.out.println("The last ordered burger in mcdonalds was "+order.getBurger());
  }
  
  
  
}
