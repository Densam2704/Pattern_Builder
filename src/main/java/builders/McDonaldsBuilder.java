package builders;

import menu.*;
import orders.McDonaldsOrder;

public class McDonaldsBuilder implements Builder {
  
  private McDonaldsBurger burger;
  private Fry fry;
  private IceCream iceCream;
  private Drink drink;
  
//  @Override
//  public void reset() {
//    mcDonaldsOrder =new McDonaldsBuilder();
//	System.out.println("Order mcDonaldsMenu.McDonaldsOrder reset");
//  }
  
  @Override
  public void orderBurger(int id) {
    McDonaldsBurger[] burgers = McDonaldsBurger.values();
    this.burger=burgers[id];
	System.out.println("Order McDonalds burger "+this.burger);
  }
  
  @Override
  public void orderFries(int id) {
    Fry[] fries = Fry.values();
    this.fry=fries[id];
	System.out.println("Order McDonalds fries "+this.fry);
  }
  
  @Override
  public void orderIceCream(int id) {
    IceCream[] iceCreams = IceCream.values();
    this.iceCream=iceCreams[id];
	System.out.println("Order McDonalds ice cream "+this.iceCream);
  }
  
  @Override
  public void orderDrinks(int id) {
    DrinkType[] drinkTypes = DrinkType.values();
    Drink drink = new Drink(drinkTypes[id]);
    this.drink=drink;
    System.out.println("Order McDonalds drinks " + this.drink.getDrinkType());
  }
  
  public McDonaldsOrder getResult(){
    return new McDonaldsOrder(burger,fry,iceCream,drink);
  }
}
