import java.awt.*;
import java.applet.*;
import java.util.*;

public class Setting extends Applet{

  public Setting(){
  }

  public static void drawBackground(Graphics g)
  {
    g.setColor(new Color(49,212,245));
    g.fillRect(10,10,900,900);
  }
  public static void drawClouds(Graphics g){
    g.setColor(new Color(255,255,255));
    //most to the left and up
    g.fillOval(200,120,70,50);
    g.fillOval(225,100,50,50);
    g.fillOval(250,100,70,50);
    //bottom center
    g.fillOval(500,180,70,50);
    g.fillOval(525,160,50,50);
    g.fillOval(550,170,70,50);
    //top right
    g.fillOval(700,90,70,50);
    g.fillOval(725,70,50,50);
    g.fillOval(750,90,70,50);
    //bottom right
    g.fillOval(675,300,70,50);
    g.fillOval(700,280,50,50);
    g.fillOval(725,300,70,50);
    //to the left and down
    g.fillOval(100,350,70,50);
    g.fillOval(125,330,50,50);
    g.fillOval(150,330,70,50);
  }
  public static void drawGround(Graphics g){
    g.setColor(new Color(41,174,55));
    g.fillRect(10,710,900,200);
  }

}
