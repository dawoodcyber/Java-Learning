/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language;
import java.util.*;


/**
 *
 * @author user
 */
public class NewClass {
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> subjects = new ArrayList<String>();
        ArrayList<Integer> score = new ArrayList<Integer>();
        subjects.add("OOP: ");
        subjects.add("DLD: ");
        subjects.add("L_A: ");
        subjects.add("M_C: ");
        subjects.add("DBMS: ");
        for(int i=0; i<subjects.size(); i++)
        {
            System.out.println(subjects.get(i));
            score.add(scan.nextInt());
                       
        }
        System.out.println("Enter the Operation!");
        System.out.println("1.Add/Store marks");
        System.out.println("2.Delete marks");
        System.out.println("3.Maximum marks");
        System.out.println("4.Minimum marks");
        System.out.println("5.Percentage");
        int options, add=0;
        options = scan.nextInt();
        if(options ==1)
        {
            System.out.println("Enter the Marks you want to store:");
            score.add(scan.nextInt());
            System.out.println(score);
        }
        else if(options ==2)
        {
            System.out.println(score);
            System.out.println("Enter the Marks you want to Remove");
           score.remove(score.indexOf(scan.nextInt()));
            System.out.println(score);
            
        }
        else if(options ==3)
        {
            System.out.println(score);
            System.out.print("Max Marks is:");
            System.out.println(Collections.max(score));
        }
        else if(options ==4)
        {
            System.out.println(score);
            System.out.print("Min Marks is:");
            System.out.println(Collections.min(score));
        }
        else if(options == 5)
        {
            System.out.println("Marks"+score);
            System.out.print("Percentage is: ");
            for(int i=0; i<score.size(); i++)
            {
                add += score.get(i);
            }
         
           int per = (add*100)/(score.size()*100);
            System.out.println(per+"%");
            
        }
        else
        {
            System.out.println("Invalid Operation");
        }
        
        
          }
    
}
