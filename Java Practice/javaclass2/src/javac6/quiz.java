
package javac6;
import java.util.*;
import java.util.Collections;
class Operations{
    Scanner scan = new Scanner(System.in);
        ArrayList<Integer> marks= new ArrayList<Integer>();
  public void main(){  
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter marks of "+(i+1)+" subject");
            // mismathc exception
            try{
            marks.add(scan.nextInt());}catch(Exception e){
                System.out.println(e);
            }
        }
  }
  public void marks(){
      System.out.println(marks);
  }
  public void percent()
  {
      int sum=0;
      for(int i=0; i<marks.size(); i++)
      {
          sum+= marks.get(i);
      }
      int per = (sum*100)/500;
      // Arithmetic exception
      try{
      System.out.println("Percentage is "+ per);}catch(Exception e){
          System.out.println(e);
      }
  }
  public void totalMarks(){
      int sum=0;
      
      for(int i=0; i<marks.size(); i++)
      {
          sum+= marks.get(i);
      }
      try{ // Array out of bound 
      System.out.println("Total marks are"+ sum);}catch(Exception e)
      {
          System.out.println(e);
      }
  }
  public int exit()
  {
      return 1;
  }
}
public class quiz {
    
    public static void main(String args[])
    {
        
        System.out.println("MARKSHEET");
        Scanner scan = new Scanner(System.in);
        Operations obj = new Operations();
        obj.main();
        int flag =0;
        
        while(flag != 1)
        {
              System.out.println("List of Operations");
        System.out.println("1. Show marks of all subjects");
        System.out.println("2. Show Percentage");
        System.out.println("3. Show  total marks");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        int choice = scan.nextInt();
        // mismatch exceptionn
        try{
            switch (choice)
            {
                case 1:
                    obj.marks();
                    break;
                case 2:
                    obj.percent();
                    break;
                case 3:
                    obj.totalMarks();
                    break;
                case 4: 
                  flag= obj.exit();
                    break;
                default :
                    break;
                
            }
        } catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
    
}
