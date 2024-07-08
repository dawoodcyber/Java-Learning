package java4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// to classify objects to seggregate objects
// class derive objects
class student1{
    // class is a template blueprint
    // class only provide information not specifically
    // class has properties and behavior
    // properties/attributes: login pass, details, email, for properties or attributes we have to create variables
    // behavior: login read , marksheet view, behavior definition we create method
    // objects are tangible and untangible;
    // virtual objects, like time, day, can feel only;
    // real objects, can see only
    
    // properties/attributes;
    String name;
    String id;
    String department;
    int semester;
    String section;
    
    // Behaviors
    public void login(){}
    public void enrollment(){
        System.out.println("Enter enrollnment details");}
    public void viewtranscript(){}
    
    
}



public class NewClass
{
    public static void main(String args[])
    {
        System.out.println("Class # 04");
//        class and object, arraylist(library), scanner library

           // objects are used to call class
           // student1()= constructor
           // s1 = object variable, multi variable, reference variable
           // s1 storing the all data of class
           // class ka name hi data type ka name hoga
           
        student1 s1 = new student1();//object is and identity of class
        
        s1.enrollment();
        
        
        
        System.out.println("\nArraylist library");
        // import java.util.Arrraylist
        // Array is a custom data type
        // ArrayList by default builtin data types, dynamic array
        
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(90);
        marks.add(80);
        marks.add(70);
        marks.add(10);
        
        System.out.println(marks);
        
        marks.remove(0);
        System.out.println(marks);
        
        // set to update value
        // 0 is index and 67 is replacement value
         marks.set(0,67);
         System.out.println(marks);
         
         marks.clear();
         // array is one but previos data is cleared
           marks.add(10);
        marks.add(20);
        marks.add(90);
        marks.add(40);
        System.out.println(marks);
        
Collections.sort(marks);// collection is for ascending
System.out.println("\nAscending matrix");
        System.out.println(marks);// collection is for ascending
        System.out.println("\n Maximum matrix");

        System.out.println(Collections.max(marks));
     System.out.println("\n Minimum matrix");

        System.out.println(Collections.min(marks));
        
        // for loops through array list we use size instead of length
        
        System.out.println("\nPrinting values through loop");
        
        for(int i=0; i<marks.size(); i++)
        {
            System.out.println(marks.get(i));
        }
        System.out.println("\nChecking index of any index");
       
        //System.out.println(marks.index.of(90));
//        
//        enter your marks 
//                oop: 90
//        engl: 80 
//                dld: 30
//                        enter the operation
//                        add1:
//                        del2:
//                        lowest marks3:
//                        percentage4:
        
        
        
        // by default arra list type is object = String, we have 
        // to define if we want to add integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> course = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        course.add("OOP: ");
        course.add("DLD: ");
        course.add("LA: ");
        course.add("MC: ");
        for(int j=0; j<course.size(); j++)
        {
            System.out.print(course.get(j));
            numbers.add(scan.nextInt());
        }
        System.out.println("Enter the operation!");
        int op = scan.nextInt();
        if(op == 1)
        {
            numbers.add(scan.nextInt());
            
        }
        if(op == 2)
        {
            System.out.println("Enter the marks you want to remove");
            // always remove trhough index
            numbers.remove(numbers.indexOf(scan.nextInt()));
            System.out.println(numbers);
            
        }
        if(op == 3)
        {
            System.out.println("Which value you want to update");
           numbers.set(marks.indexOf( scan.nextInt()), 44);
        }
        
        
        
        
        
        
        
        

        
        
        
    }
}