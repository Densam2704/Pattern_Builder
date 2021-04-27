package orders;

import menu.Drink;
import menu.Fry;
import menu.IceCream;
import menu.KFCBurger;

public class KFCOrder {
  private KFCBurger burger;
  private Fry fry;
  private IceCream iceCream;
  private Drink drink;
  
  public KFCOrder(KFCBurger burger, Fry fry, IceCream iceCream, Drink drink) {
	this.burger = burger;
	this.fry = fry;
	this.iceCream = iceCream;
	this.drink = drink;
  }
  
  public KFCBurger getBurger() {
	return burger;
  }
  
  public Fry getFry() {
	return fry;
  }
  
  public IceCream getIceCream() {
	return iceCream;
  }
  
  public Drink getDrink() {
	return drink;
  }
}
