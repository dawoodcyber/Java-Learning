/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass2;

/**
 *
 * @author user
 */
import java.util.*;

public class loops {

    public static void main(String args[]) {
        int i, rem;
        System.out.println("dawood");
        for (i = 0; i < 501; i++) {
            int n = i, add = 0;
            while (n != 0) {
                rem = n % 10;
                n /= 10;

                add += (rem * rem * rem);
            }
            if (add == i) {
                System.out.println("Number is armstrong = " + add);
            }
        }
    }

}
