import java.awt.*;
import java.applet.*;
import java.util.*;

public class Runner extends Applet
{
  public void paint(Graphics g){
    Setting setting1 = new Setting();
    setting1.drawBackground(g);
    setting1.drawClouds(g);
    setting1.drawGround(g);
  }

}
