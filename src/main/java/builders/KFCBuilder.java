package builders;

import menu.*;
import orders.KFCOrder;

public class KFCBuilder implements Builder{
  private KFCBurger burger;
  private Fry fry;
  private IceCream iceCream;
  private Drink drink;
  @Override
  public void orderBurger(int id) {
    KFCBurger burgers[]=KFCBurger.values();
    this.burger=burgers[id];
    System.out.println("KFC order burger "+this.burger);
  }
  
  @Override
  public void orderFries(int id) {
    Fry[] fries = Fry.values();
    this.fry=fries[id];
    System.out.println("KFC order fries "+this.fry);
  }
  
  @Override
  public void orderIceCream(int id) {
    IceCream[] iceCreams = IceCream.values();
    this.iceCream=iceCreams[id];
    System.out.println("KFC order ice cream "+this.iceCream);
  }
  
  @Override
  public void orderDrinks(int id) {
    DrinkType[] drinkTypes = DrinkType.values();
    Drink drink = new Drink(drinkTypes[id]);
    this.drink=drink;
    System.out.println("Order KFC drinks " + this.drink.getDrinkType());
	
  }
  
  public KFCOrder getResult(){
    return new KFCOrder(burger,fry,iceCream,drink);
  }
}
