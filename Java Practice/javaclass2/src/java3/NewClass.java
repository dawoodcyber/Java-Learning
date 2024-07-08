package java3;

import java.util.Scanner;

public class NewClass {

    public static void main(String args[]) {
        System.out.println("Matrix Addition with for loop");
        int matrixA[][] = {{1, 3}, {2, 4}};
        int matrixB[][] = {{1, 4}, {3, 5}};
        int matrixC[][] = {{0, 0}, {0, 0}};
        //int matrixC[][];
        int count = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.print("+");
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.print("=");
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixB[i][j] + matrixA[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("Matrix Addition with while loop");

        int i = 0;
        while (i < matrixA.length) {
            int j = 0;
            while (j < matrixA.length) {
                System.out.print(matrixA[i][j] + " ");
                j++;
            }
            System.out.print("+");
            int k = 0;
            while (k < matrixB.length) {
                System.out.print(matrixA[i][k] + " ");
                k++;
            }
            System.out.print("=");
            int l = 0;
            while (l < matrixA.length) {
                System.out.print(matrixA[i][l] + matrixB[i][l] + " ");
                l++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("Matrix Addition with do-while loop");

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matrixA[i][j] + " ");
                j++;
            } while (j < matrixA.length);
            System.out.print("+");

            int k = 0;
            do {
                System.out.print(matrixA[i][k] + " ");
                k++;
            } while (k < matrixA.length);

            System.out.print(" = ");

            int l = 0;
            do {
                System.out.print(matrixA[i][l] + matrixB[i][l] + " ");
                l++;
            } while (l < matrixA.length);

            System.out.println();
            i++;
        } while (i < matrixA.length);
        System.out.println("Matrix Addition with for-each loop");
        int m = 0;
        for (int n1[] : matrixA) {
            int n = 0;
            for (int num : n1) {
                System.out.print(num + " ");
            }
            System.out.print("+ ");
            for (int num : n1) {
                System.out.print(matrixB[m][n] + " ");
                n++;
            }
            System.out.print("= ");
            int o = 0;
            for (int add : n1) {
                System.out.print(matrixA[m][o] + matrixB[m][o] + " ");
                o++;
            }
            m++;
            System.out.println("");

        }

        // Scanner is a class;
        // objects has two things properties/attributes and behavior
        // Object [student s1 = new student();] //here s1 is object type variable, 
        //class ke saray data ko store krna, multitype variable he ya reference 
        //type variable.
        // here student() is method.
        // class used for calssifcation , class is an instance of object, class is noting
        //if we are not retreiving any object.
        // new is used fo memory allocation.
        // + has two functions 
        // 1 is addition and other is concatenation
        //if it's with string contatenation otherwise add.
        // next only take a word nextline all line.s
        Scanner scan = new Scanner(System.in);
        // type casting
        int num1 = Integer.parseInt(scan.next());
        int num2 = Integer.parseInt(scan.next());
        // int num3 = scan.nextFloat();

    }

    class student {

        String name;
        int age;
        String section;
        String Dpeartment;
        String ID;
        String sec;

        public void EnrollmentCMS() {

        }

        public void LoginCMS() {

        }

        public void ViewResult() {

        }
    }

    class Teacher {

        String name;
        int age;
        String ID;
    }

}
// Assignment 
//enter marks
//oop: 100
//DLD:100
//English:100
//
//Average: 
//percentage:
