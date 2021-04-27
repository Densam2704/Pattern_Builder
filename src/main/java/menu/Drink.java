package menu;

public class Drink {
//  private double volume = 0.3;
  private DrinkType drinkType=DrinkType.COFFEE;
  
  public Drink(DrinkType drinkType){
    this.drinkType=drinkType;
  }
  
//  public void smallDrink(){
//	System.out.println("small drink");
//    volume=0.2;
//  }
//
//  public void mediumDrink(){
//	System.out.println("medium drink");
//	volume=0.3;
//  }
//
//  public void largeDrink(){
//	System.out.println("large drink");
//    volume=0.5;
//  }
//
//  public double getVolume() {
//	return volume;
//  }
  
  public DrinkType getDrinkType() {
	return drinkType;
  }
}
