package LabTask10;
class Teacher {
    public void work() {
        System.out.println("Teacher is teaching");
    }
}
class Student1 extends Teacher {
    @Override
    public void work() {
        System.out.println("Ali is studying Maths");
    }
}
class Student2 extends Teacher {
    @Override
    public void work() {
        System.out.println("Aizel is studying Geography");
    }
}
public class Main {
    public static void main(String args[]) {
        Teacher t = new Teacher();
        t.work();
        Student1 st1 = new Student1();
        st1.work();
        Student2 st2 = new Student2();
        st2.work();
    }
}
