package dircetor;

import builders.Builder;

public class Director {
  public void makeOrder1(Builder builder){
    builder.orderBurger(1);
	builder.orderFries(0);
	builder.orderIceCream(2);
	builder.orderDrinks(1);
  }
  
  public void makeOrder2(Builder builder){
	builder.orderBurger(2);
	builder.orderFries(1);
	builder.orderIceCream(1);
	builder.orderDrinks(0);
  }
  
  public void makeOrder3(Builder builder){
	builder.orderBurger(3);
	builder.orderFries(2);
	builder.orderIceCream(0);
	builder.orderDrinks(0);
  }
  
}
