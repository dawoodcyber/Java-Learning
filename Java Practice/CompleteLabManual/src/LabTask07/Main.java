package LabTask07;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any number to find factorial of: ");
        int num = scan.nextInt();
        int fac = factNum(num);
        System.out.println("Factorial of "+ num + " is "+ fac);
        
    }
    public static int factNum(int x)
    {
        int sum =1;
        for(int i=1; i<x; i++)
        {
           sum += sum*i; 
        }
        return sum;
    }    
}
