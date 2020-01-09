import java.awt.*;
import java.applet.*;
import java.util.*;

public class Rain(){
  int d;
  int x;
  int y;
  int red;
  int blue;
  int green;

  public Rain(){
    d,x,y,red,blue,green = 0;
    
  }

  public static drawRain (Graphics g){
    for (int k=1; k<=100; k++)
    {
      d = (int) (Math.random()* 201);
      x = (int) (Math.random()* (391-d)) + 10;
      y = (int) (Math.random()* (291-d)) + 300;
      red = (int) (Math.random()* 256);
      blue = (int) (Math.random()* 256);
      green = (int) (Math.random()* 256);
      g.setColor(new Color(red,green,blue));
      g.fillOval(x,y,d,d);
    }

  }


}
