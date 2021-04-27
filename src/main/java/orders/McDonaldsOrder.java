package orders;

import menu.Drink;
import menu.Fry;
import menu.IceCream;
import menu.McDonaldsBurger;

public class McDonaldsOrder {
  private McDonaldsBurger burger;
  private Fry fry;
  private IceCream iceCream;
  private Drink drink;
  
  public McDonaldsOrder(McDonaldsBurger burger, Fry fry,
                        IceCream iceCream, Drink drink) {
    this.burger = burger;
    this.fry = fry;
    this.iceCream = iceCream;
    this.drink = drink;
  }
  
  public McDonaldsBurger getBurger() {
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
