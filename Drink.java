import java.awt.*;
import java.applet.*;
import java.util.*;

public class Drink{
  protected int size;
  protected int x;
  protected int y;
  public Drink(){
    size = 50;
    x=10;
    y=10;
  }

public Drink(int x, int y, int size){
  this.size = size;
  this.x = x;
  this.y = y;
  }
public void drawDrink(Graphics g){
//draw Cup
  g.drawLine(x,y,x,y+size);
  g.drawLine(x+50+(size/2),y,x+50+(size/2),y+size);
  g.drawOval(x,y+size-10-(size/10),50+(size/2),20+(size/5));
  g.drawOval(x,y-10-(size/10),50+(size/2),20+(size/5));

//draw Straw
  g.fillRect(x+25,y-15,5,25);

//draw Liquid
g.setColor(new Color(0,0,255));
g.fillRect(x,y+10,50+(size/2),30+((size*3)/10));
g.fillOval(x,y+size-10-(size/10),50+(size/2),20+(size/5));
g.fillOval(x,y-(size/10),50+(size/2),20+(size/5));
g.setColor(new Color(0,0,0));
}

}
