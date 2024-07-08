package LabTask04;
import java.util.*;
public class Main {

    public static void main(String args[]) {
        int[][] arr1 = {{1, 2, 2, 1}, {2, 1, 1, 2}};
        int[][] arr2 = {{1, 2, 2, 1}, {2, 1, 1, 2}};
        int i=0,j;
        System.out.println("Sum of Array1 and Array2");
        while(i<arr1.length)
        {
            j=0;
            while(j<arr2.length)
            {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
