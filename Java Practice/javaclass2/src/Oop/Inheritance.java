/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oop;
 class shape{
        String color;
        int vertex;
        public void setColor(String x)
        { 
            color = x;
        }
    }
    class line extends shape{
        
        
    }
    class circle extends shape{       
        int radius;
    }
public class Inheritance {
    /*
    parent class is called base, super class
    child class is called sub , derived class
    Advantages
        reusability
        redundancy
        increased maintability
    We'll check first of all our classes if we have multiple
    common behaviors or attributes then we use inheritance.
    first child will come and according child classes we'll introduce
    or make parent class
    
    First we see these three things:
        1. generalization (common things behavior)
        2. Subtyping (extension: adding the whole previous code then add further code)
        3. Specialization (restriction: when we have conditions we use inheritance)
    */
   
    public static void main(String args[])
    {
        line objLine = new line();
        objLine.color = "Blue";
        
        objLine.setColor("Black");
        System.out.println(objLine.color);
        
        
        
    }
}
