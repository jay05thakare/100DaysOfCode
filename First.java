import java.awt.*;
import java.applet.*;

public class First extends Applet {

  String msg = "";
  public void init(){
    msg = "Helllo geeks";

  }

  public void start(){
    msg += "welcome prathmesh";
  
  }

  public void paint(Graphics g){
    g.drawString(msg,20,20);
  }
}