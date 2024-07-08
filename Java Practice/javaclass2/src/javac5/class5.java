
package javac5;
// encacpsulateion
class account
{
    // private means no one access these variables
    private String accountTitle;
    private int accountNumber;
    int atmPin;
    // for defining access , setters and getters methods are used
    // like registration part call setters and login call getters
    
    // local and global variables
    // green are global variables
    //black are local variables
    // setters and getters
    //this keywords(for differentiation)
    public void SetAccountDetails(String accountTitle, int accountNumber)
    {
        // this for differentiate ke which one is global or local var
        // if we dont want to use 'this'  change the name of the var
        // but it will increase no. of variables
      
        this.accountTitle = accountTitle;
        // myaccountTitle = accountTitle;
        this.accountNumber = accountNumber;
    }
    // getter
    public String getAccountTitle()
    {
        return accountTitle;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    
    
    
    public void fundTransfer(){}
    public void loginaccount(){}
    public void creditCardPayment(){}
    
}

class math
{
    int num1;
    int num2;
    math()
    {
        
    }
    
    math(int num1, int num2)
    {
        this.num1 = num1; // initialize set data
        this.num2 = num2;
    }
}

public class class5 {
    public static void main(String[] args)
    {
        System.out.println("CLASS 05\n");
        account ac = new account();
        ac.SetAccountDetails("Dawood", 123);
        System.out.println(ac.getAccountTitle());
        System.out.println(ac.getAccountNumber());
        
        // CONSTRUCTORS;
        // whenever we maek object, constructor automatically create
        // class ke data members ko banana
        // class ke variables ko initialize krana
        
        /*
        1.Default constructor
        2.no-ags constructor
        3.parameter construcotr
        */
        math m = new math(2,3);// math() called  default constructor
        math m1 = new math();// math() called  default constructor
        
        

    
    }
    
}




/*        Course Contents
                object orientation
                objects and classes
                Overloading
                Inheritance
                Polymorphism
                Generic programming
                Exception Handling
                Intro to design patterns
        
        -Before we create anything first we made model.
        -In programming we have flow charts as a model
        -Ex. in whatsapp , status, calls, chat, channels are objects and there
        interactions are called model
        -OO models map to reality
        -OO  easy to develop(update, delete), easy to understand.
        - objects can be tangible and apprehended.
        -In apprehended/untangible: attributes are hours, second and minues
        and behaviour will be set time set date set minutes.
        -

        
*/
        /* 1st pillar Encapsulation
            -putting code in a capsule for privacy, for unauthorized access
            -

*/