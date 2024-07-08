package LabTask02;
import java.util.*;
public class Main {
    public static void main(String args[])
    {
        // Comparing your expenses with income
        Scanner scan = new Scanner(System.in);
        ArrayList<Float> marks = new ArrayList<>();
        float sum=0, course, per, gpa;
        System.out.println("Enter number of courses you have studied: ");
        course = scan.nextInt();
        for(int i=0; i<course; i++)
        {
            System.out.println("Enter marks of the subject: ");
            marks.add(scan.nextFloat());
            sum = sum + marks.get(i);            
        }
         per = (sum * 100)/(course*100);
         gpa = (per*4)/100;
         System.out.println("Your Percentage is "+per);
         System.out.println("Your GPA is "+gpa);
    }}
