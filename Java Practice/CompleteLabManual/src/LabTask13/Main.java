package LabTask13;
abstract class Shape {

    abstract void draw();
}
class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Main {
    public static void main(String args[]){
       Circle c = new Circle();
       c.draw();
       
       Rectangle r = new Rectangle();
       r.draw();
    }
}
