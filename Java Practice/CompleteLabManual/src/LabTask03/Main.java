package LabTask03;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of lines you want for Triangle Pattern?: ");
        int lineNumber = scan.nextInt();
        for(int i=1; i<=lineNumber; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            
            }
            System.out.println("");
        }
    }
    
}
