import java.awt.*;
import java.applet.*;
import java.util.*;

public class Lemonade extends Drink{
  public Lemonade(int x2, int y2, int size2){
    x = x2;
    y = y2;
    size = size2;
  }
public void drawDrink(Graphics g){
  super.drawDrink(g);
  g.setColor(new Color(250,211,17));
  g.fillRect(x,y+10,50+(size/2),30+((size*3)/10));
  g.fillOval(x,y+size-10-(size/10),50+(size/2),20+(size/5));
  g.fillOval(x,y-(size/10),50+(size/2),20+(size/5));
  g.setColor(new Color(0,0,0));
}
}
