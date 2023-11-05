import java.applet.Applet;
import java.awt.Graphics;
public class SkeletonApplet extends Applet{
    public void init(){
        System.out.println("Initialization Started");
    }
    public void start(){
        System.out.println("Applet Started");
    }
    public void paint(Graphics g){
        g.drawString("Welcome to the new and Wonderful Java World", 100,100);
    }
    public void stop(){
        System.out.println("Applet Stopped");
    }
    public void destroy(){
        System.out.println("Boom! Applet Destroyed");
    }
}