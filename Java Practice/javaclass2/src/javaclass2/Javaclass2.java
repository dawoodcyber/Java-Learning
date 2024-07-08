package javaclass2;

/* OOP
OBJECT ORIENTED PROGRAMMING
 */
 /* ACCESS MODIFIER

 */
public class Javaclass2 {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        int num1;
        float f1;
        double d1;
        boolean status;// declared, memory reserved
        char c;
        String name = "Dawood";//string is a custom data type
        // by default data types color blue;
        // custom data type color is black or we can create these

        // when we have more data then we use arrays
        // for array we use homogenous data type means similar type only 1,2,3 or a,b,c
        //for array declaration
        String students[] = {"Dawood", "Abdul", "Ali"}; // first we declare type and then array
        // size automatically adjust in an array;
        // for two dimensional array
        String Users[][] = {{"A", "B", "C"}, {"D", "E", "F"}};
        // Types of array
        // Multi demensional and one dimensional

        // Array normally used in Graphics
        // Screen is called Matrix: rows and columns
        // And for saving matrix we have to use array
        // so simply we use array for graphics
        /*
            2 3 3
            4 5 3
            1 3 4
        2*2 matrix
        
         */
        // first row stored in first block
        int matrixA[][] = {{2, 3}, {4, 5}};
        //  System.out.println(matrixA[1][1]);
        //      System.out.println(matrixA[2][2]);

        // for loop is static loop , because we know how much type we have to run
        // while is dynamic loop, for reptitive work and we don't know when to end it.
        // when we uncertainty  then while used
        /*  for(int i=0; i<matrixA.length; i++)
    {
           for(int j=0; j<matrixA.length; j++)
        {
            
            System.out.print(" "+matrixA[i][j]);
        }
           System.out.println("");
    }
         */
 /* int i = 0;
        while (i < matrixA.length) {
            int j = 0;
            while (j < matrixA.length) {
                System.out.print(matrixA[i][j]+" ");
                j++;
            }
            System.out.println("");
            i++;
        }

    }
    * /

}
/*i=0 condition 0<2
j=0 condition 0<2           print=2
j becomes 1
1<2                         print=3
j becomes 2
2 is not less than 2
loop end
print single line
i becomes 1 
condition 1<2
j initialize to 0, condition 1<2    print 4
j=1, condition 1<2          print 5
j=2, condition 2 is not less than 2
loop ends
print a single line
i=2, condition 2 is not less than 2
outer loop ends

         */
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matrixA[i][j] + " ");
                j++;
            } while (j < matrixA.length);
            System.out.println(" ");
            i++;
        } while (i < matrixA.length);
        System.out.println(" \n\n");
        int matrixB[]={1,2,3,4};
                // for each loop works on values:
                for(int n: matrixB){
                    System.out.println(n);
                }
                
                System.out.println("\n 2d matrix\n");
                
                for(int d[]: matrixA)
                {
                    for (int m:d){
                        System.out.print(m+" ");
                    }
                    System.out.println(" ");
                }
        
        
        
        
    }

}
