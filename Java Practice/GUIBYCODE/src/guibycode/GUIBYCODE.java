package guibycode;

import java.awt.Image;
import javax.swing.*;
public class GUIBYCODE {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Untitled-Notepad");
        frame.setSize(1080,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        ImageIcon ic = new ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Extra\\notepad.png");
        Image im  = ic.getImage();
        frame.setIconImage(im);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu format = new JMenu("Format");
        JMenu view = new JMenu("View");
        JMenu help = new JMenu("Help");
        
        JMenuItem it1 = new JMenuItem("New        Ctrl+N");
        JMenuItem it2 = new JMenuItem("Open       Ctrl+O");
        JMenuItem it3 = new JMenuItem("Save       Ctrl+S");
        
        file.add(it1);
        file.add(it2);
        file.add(it3);
        
        JMenuItem it4 = new JMenuItem("Cut        Ctrl+X");
        JMenuItem it5 = new JMenuItem("Copy       Ctrl+C");
        JMenuItem it6 = new JMenuItem("Paste      Ctrl+V");
        
        edit.add(it4);
        edit.add(it5);
        edit.add(it6);
        
        JMenuItem it7 = new JMenuItem("Word Wrap");
        JMenuItem it8 = new JMenuItem("Font");
        
        format.add(it7);
        format.add(it8);
        
        JMenuItem it9 = new JMenuItem("Zoom");
        JMenuItem it10 = new JMenuItem("Status Bar  >");
        
        view.add(it9);
        view.add(it10);
        
        JMenuItem it11 = new JMenuItem("View Help");
        JMenuItem it12 = new JMenuItem("Send Feedback");
        
        help.add(it11);
        help.add(it12);
        
        
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);
        
        
        frame.setJMenuBar(mb);
        
        frame.setVisible(true);
        
        
    }
    
}
