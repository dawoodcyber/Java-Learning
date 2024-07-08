package LabTask08;
class Animal
{
     String a1 = "cat";
     Animal(String a1){
         this.a1 = a1;
     }
     Animal(Animal a1){
         this.a1 = a1.a1;
     }
     Animal(){}
}
public class Main {
    public static void main(String args[])
    {
        //zero argument constructor
        Animal animal1 = new Animal();        
        System.out.println(animal1.a1);
        
        //single argument constructor
        Animal animal2 = new Animal("Dog");
        System.out.println(animal2.a1);
        
        //Copy constructor
        Animal animal3 = new Animal("Chicken");
        Animal animal4 = new Animal(animal3);
        System.out.println(animal4.a1);        
    }
}
