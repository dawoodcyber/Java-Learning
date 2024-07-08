/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oop;
interface ATMOp{
    public void fundTransfer();
    public void cashWithDraw();
    
}
interface ATMOp1{
    public void fundTransfer();
    public void cashWithDraw();
    
}
class MCBBank implements ATMOp,ATMOp1{
    public void fundTransfer(){}
    public void cashWithDraw(){}
}
public class Interface {
    public static void main(String args[])
    {
        
    }
    
}
