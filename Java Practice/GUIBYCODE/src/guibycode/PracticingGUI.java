package guibycode;

import java.util.ArrayList;

class Encapsulation {

    private ArrayList<Integer> arr = new ArrayList<>();

    public void setter(int fac) {

        for (int i = 1; i <= fac; i++) {
            if (fac % i == 0) {
                arr.add(i);
            }
        }
    }

    public ArrayList getter() {

        return this.arr;
    }
}

public class PracticingGUI {

    public static void main(String args[]) {

        Encapsulation obj = new Encapsulation();
        obj.setter(10);
        System.out.println(obj.getter());
    }

}
