import java.awt.*;
import java.applet.*;
import java.util.*;

public class Runner extends Applet
{

  public void paint(Graphics g){
    Drink drink = new Drink(50,50,50);
    drink.drawDrink(g);
    Coffee coffee = new Coffee(200,200,50);
    coffee.drawDrink(g);
    Lemonade lemonade = new Lemonade(300,300,50);
    lemonade.drawDrink(g);
  }

}
