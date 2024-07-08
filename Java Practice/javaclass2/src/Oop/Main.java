/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oop;
abstract class ATMOperation{
    // we only define in this class
   private int ATMPin;
    String ATMB;
    // memory blocks remain same, even if we define the method again in another class
    abstract void fundTransfer();
    abstract void withDraw();
    abstract void creditPayment();
    abstract void billPayment();// functions methods defined

}
abstract class ATMOperation1{
    // we only define in this class
   
    abstract void creditPayment();
    abstract void billPayment();// functions methods defined
    // abstact class should not be more than 2, other wise no benefits

}

class SCBAtm extends ATMOperation{
    public void fundTransfer(){}
    public void withDraw(){}
    public void creditPayment(){}
    @Override
    public void billPayment(){
        System.out.println("dawood");
    }
}
class NBPAtm extends ATMOperation{
    public void fundTransfer(){}
    public void withDraw(){}
    public void creditPayment(){}
    public void billPayment(){}
}
public class Main {
    public static void main(String args[])
    {
        /*
        Complexity = time + space
        Abstraction = khayali puloa, fantasy, decreases complexity
        Abstraction is a way to cope with complexity
        Abstraction = shows what users need, and hides what they don't
        Advantages:
            . Simplifies the model by hiding irrevelant details
            . Abstraction provides the freedom to defer implementation
              descisions by avoiding commitment to details
        Object or packet we can use according to our need
            . Security hiding data
            . How much acess you want to give from the class
        */
        /*
        IMPLEMENTATION
            -Abstract Class
            -Interface
        Abstract class is not real and we can't make an object of it
        */
        
        SCBAtm objATM = new SCBAtm();
        NBPAtm obj = new NBPAtm();
        obj.billPayment();
        // we cannot extend two abstract or real classes in one we'll use interface
        
        
        
    }
    
}
