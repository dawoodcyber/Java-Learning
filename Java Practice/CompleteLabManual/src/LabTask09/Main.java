package LabTask09;
import java.util.*;
class UserRegistration
{
    private String name,fname,city,country;
    private int age; 
    public void setName(String name){this.name = name;}
    public void setFname(String fname){this.fname = fname;}
    public void setAge(int age){this.age = age;}
    public void setCity(String city){this.city = city;}
    public void setCountry(String country){this.country = country;}
    
    public String getName(){return this.name;}
    public String getFname(){return this.fname;}
    public String getCity(){return this.city;}
    public String getCountry(){return this.country;}
    public int    getAge(){return this.age;}
}
public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        UserRegistration u1 = new UserRegistration();
        System.out.println("Welcome to User Registration System");
        
        System.out.println("Enter your name: ");
        u1.setName(scan.nextLine());
        System.out.println("Enter your father's name: ");
        u1.setFname(scan.nextLine());
        System.out.println("Enter your age: ");
        u1.setAge(scan.nextInt());
        System.out.println("Enter your city: ");
        u1.setCity(scan.next());
        System.out.println("Enter your country: ");
        u1.setCountry(scan.next());
        
        System.out.println("Here are your Details: ");
        System.out.println("Name = "+u1.getName());
        System.out.println("Father's name = "+u1.getFname());
        System.out.println("Age = "+u1.getAge());
        System.out.println("City = "+u1.getCity());
        System.out.println("Country = "+u1.getCountry());        
    }    
}
