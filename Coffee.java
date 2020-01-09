import java.awt.*;
import java.applet.*;
import java.util.*;

public class Coffee extends Drink{
  public Coffee(int x1, int y1, int size1){
    x = x1;
    y = y1;
    size = size1;
  }
public void drawDrink(Graphics g){
  super.drawDrink(g);
  g.setColor(new Color(88,52,21));
  g.fillRect(x,y+10,50+(size/2),30+((size*3)/10));
  g.fillOval(x,y+size-10-(size/10),50+(size/2),20+(size/5));
  g.fillOval(x,y-(size/10),50+(size/2),20+(size/5));
  g.setColor(new Color(0,0,0));
}



}
