/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oop;
class Calculation{
    public int div(int a, int b)
    {
        return a/b;
    }
    public float div(float a,float b)
    {
        return a/b;
    }
}
class Math
{
    public void divide(int a , int b){}
    public void divide(float a, int b){}
}
class calculas extends Math{
    
}
public class Polymorphism {
    /*
    Polymorphism
    Poly = Many
    morphism = forms
    one person performs different actions in different environments
    Compile time Polymorphism
        i. Operator Overloading
        ii. FUnction Overloading
    Run time Polymorphism
        i. Virtual function (over riding) same parameter
    */
    public static void main(String args[])
    {
        Math obj = new calculas();
        Calculation ojb = new Calculation();
        ojb.div(2, 3);
        ojb.div(0.2f, 3.0f);
        
       
    }
}

