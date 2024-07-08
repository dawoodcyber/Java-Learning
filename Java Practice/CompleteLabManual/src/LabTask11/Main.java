package LabTask11;
class Add {
    public int add(int x, int y){return x+y;}
    public int add(int x, int y, int z){return x+y+z;}
    public double add(double x, double y){return x+y;}
    public double add(double x, double y, double z){return x+y+z;}
}
public class Main {
    public static void main(String args[]) {
        Add ob = new Add();
        System.out.println("Sum of two integers: "+ ob.add(2, 8));
        System.out.println("Sum of three integers: "+ ob.add(2, 8,10));
        System.out.println("Sum of two doubles: "+ ob.add(2.43, 8.3));
        System.out.println("Sum of three doubles: "+ ob.add(2.43, 8.3, 9.99));
    }
}
