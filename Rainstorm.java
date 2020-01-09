import java.awt.*;
import java.applet.*;
import java.util.*;

public class Rainstorm extends Setting{
  private Rain drizzle;


  public Rainstorm(){
    drizzle = new Rain();

  }
  public static drawRainstorm(Graphics g){
    drizzle.drawRain(g);
  }

}
