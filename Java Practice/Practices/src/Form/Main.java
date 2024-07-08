package Form;
import java.awt.Image;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main
{
    public static void main(String args[]) 
    {
        JFrame f = new JFrame("GAME");
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        ImageIcon icon = new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\scholorship\\mypic.png");
        Image image = icon.getImage();
        f.setIconImage(image);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu play = new JMenu("Play");
        JMenu v1 = new JMenu("1 V 1");
        JMenu invent = new JMenu("  Inventory");
        
        JMenuItem i1 = new JMenuItem("Continue");
        JMenuItem i2 = new JMenuItem("Restart");
        JMenuItem i3 = new JMenuItem("Pause");
        
        JMenuItem i4 = new JMenuItem("Call Friends");
        JMenuItem i5= new JMenuItem("Connect");
        JMenuItem i6 = new JMenuItem("Disconnect");
        
        
        JMenuItem i7= new JMenuItem("Backpack");
        JMenuItem i8= new JMenuItem("Outfits");
        JMenuItem i9= new JMenuItem("Coupons");
        JMenuItem i10= new JMenuItem("Treasure");
        
        
        play.add(i1);
        play.add(i2);
        play.add(i3);
        
        v1.add(i4);
        v1.add(i5);
        v1.add(i6);
        
        invent.add(i7);
        invent.add(i8);
        invent.add(i9);
        invent.add(i10);
        
        mb.add(play);
        mb.add(v1);
        mb.add(invent);
        
        f.setJMenuBar(mb);
        
        f.setVisible(true);
        
        
    }
   
}
