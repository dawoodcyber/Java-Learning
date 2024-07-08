/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac5;
class accounts
{
    private String userName;
    private String pass;
    private int age;
    private String country;
    // setters
    public void setDetails(String userName, String pass, String country, int age)
    {
        this.age = age;
        this.userName = userName;
        this.pass = pass;
        this.country = country;
        
        
    }
    
    // getters
    
    public String getName()
    {
        return userName;
    }
    public String getCountry()
    {
        return country;
    }
    public String getPass()
    {
        return pass;
    }
    public int getAge()
    {
        return age;
    }
    
    
    
    
    // member functions
    public void login(){}
    public void signup(){}
}
public class practice {
    public static void main(String args[])
    {
        accounts pr = new accounts();
       
        
        pr.setDetails("Dawood", "123", "Pak", 19);
        System.out.println(pr.getName() );
        System.out.println(pr.getPass() );
        System.out.println(pr.getAge() );
        System.out.println(pr.getCountry() );
        
        
    }
    
}
