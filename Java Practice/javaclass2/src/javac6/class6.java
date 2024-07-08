package javac6;

import java.util.Scanner;

public class class6 {
    public static void main(String args[])
    {
        System.out.println("TOPIC: Exception");
        // ide trace syntax error
        // logical error: result is not correct
        //runtime error: program is accurate , logical and syntax is correct. but system error, error because of hardware
        /*
        In Java we called error is EXCEPTIONS;
        EXCEption: the output we are not expecting.
        Exception is a part of OOP is always comes in (object)OOP
        Exception always throw
        throw two things 1. exceptions , 2.errors
        1.Errors
            i.   stack overflow(when your limit(code) is full, stack is full)
            ii.  virtual Memory/Machine Error: temporary space is created near hard disk 
                  called virtual memory, when windows installed. backside opened programs depend on Virtual Memory
            iii. Out of Memory Error: when program is running and some data removed from 
                 ramm and  then this error will show that data is not available
        2. EXCeptions: Depends oon  our code
        i. checked exceptionns: if we know that panga will come.
            1. SQL Exception: (communication is not correct with external environment)wheenver we are connecting with external environment
            2. ios excpetion: (input / output error)wheenver we are connecting with external environment
            3. class not found exception: (When class is not found or creating any issue)wheenver we are connecting with external environment
        ii unchecked exceptions: we don't know but when we run and then unexpectaed result
        came then called uncheck exception
            1. Arithmentic exception: mathematical issue creating unexpected result
            2. Null pointers exception: when pointer is not deeclared but not initialized and we are using again and again which is null value
            3. Index out of Bound Exception: Array index out of bound Exceptionn, Stringn index out of bound
        
        Whenever do connectivity through data base
      
        */
        // Arithmetic Exception
        int num1 = 100;
        int num2 = 0;
        // when we are not initialize the variable with value
        // null pointer exceptionn
        String name=null;
        // Exception Handling
        try{ // if there is an issue or not
        System.out.println(num1/num2);
        }
        catch(Exception e)// error is stored in e
        {
            System.out.println(e);
        }
        System.out.println("Code is running");
        
        try{
        System.out.println(name.charAt(1));
        }
        catch(Exception n)
        {
            System.out.println(n);
        }
        try{
        System.out.println(name.charAt(1));
        }
        // only check null pointer exception
        catch(NullPointerException n)
        {
            System.out.println(n);
        }
        
        // Another error
        int[] list={1,2,3,4,5,6,6,9};
        // values will be printed here but in the end error will come
        // error: ArrayIndex out of bound, most coming error
        try{
        for(int i=0; i<=list.length; i++)
        {
            System.out.println(list[i]);
        }}catch(Exception e){
            System.out.println(e);
        }
        String Course = "OOP";
        // error: uncheck: String index out of bound
        try{
        System.out.println(Course.charAt(4));}catch(Exception e)
        {
            System.out.println(e);
        }
        
        // Another error
        // error: input mismatch exception
        // giving string as an input.
        Scanner input = new Scanner(System.in);
        input.nextInt();
        System.out.println("Array");
        String[][][] arr={{{"3","5"},{"3","5"}}};
        System.out.println(arr[0][1][0]+arr[0][1][1]);
    }
    
}
