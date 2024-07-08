package language;
import java.util.*;
public class Language
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of rows for 1st Matrix");
        int r1 = scan.nextInt();
        System.out.println("Enter no. of columns for 1st Matrix");
        int c1 = scan.nextInt();
        System.out.println("Enter no. of rows for 2nd Matrix");
        int r2 = scan.nextInt();
        System.out.println("Enter no. of columns for 2nd Matrix");
        int c2 = scan.nextInt();
        int[][] Matrix_1 = new int[r1][c1];
        int[][] Matrix_2 = new int[r2][c2];
        if(c1 == r2)
        {
            int[][] Matrix_3 = new int[r1][c2];
            int i, j, k, f1=0;
            System.out.println("\nEnter values for 1st matrix:");
            for(i=0; i<r1; i++)
            {
                for(j=0; j<c1; j++)
                {
                    Matrix_1[i][j] = scan.nextInt();
                }
            }
            System.out.println("\nEnter values for 2nd matrix:");
            for(i=0; i<r2; i++)
            {
                for(j=0; j<c2; j++)
                {
                    Matrix_2[i][j] = scan.nextInt();
                }
            }
            System.out.println("MATRIX MULTIPLICATION\n");
            if(r1>r2)
                   f1=r1;
            else
                f1=r2;
            
            for(i=0; i<f1; i++)
            {
                if( i< r1){
                for(j=0; j<c1; j++)
                {
                    System.out.print(Matrix_1[i][j]+" ");
                }
                }
                else
                {
                    
                    for(j=0; j<c1; j++)
                    {
                        if(i >= r1)
                               break;
                        
                        System.out.print(Matrix_1[i][j]+"");
                        
                    }
                }
                
                
                
                
                System.out.print(" * ");
                
                
                if(i < r2){
                for(j=0; j<c2; j++)
                {
                    System.out.print(Matrix_2[i][j]+" ");
                }
                }
                else{
                    for(j=0; j<c2; j++)
                 {
                     if(i >= r2)
                        break;
                    System.out.print(Matrix_2[i][j]+" ");
                    
                 }
                }
                System.out.print(" = ");
                
                if(i<r1){
                for(j=0; j<c2; j++)
                {
                    for(k=0; k<c1; k++)
                    {
                        Matrix_3[i][j] += Matrix_1[i][k] * Matrix_2[k][j];
                    }
                    System.out.print(Matrix_3[i][j]+" ");
                }
                }
                else
                {
                    for(j=0; j<c2; j++)
                    {
                         if(i<=r2)
                               break;
                         
                        for(k=0; k<c1; k++)
                        {
                         Matrix_3[i][j] += Matrix_1[i][k] * Matrix_2[k][j];
                        }
                        System.out.print(Matrix_3[i][j]+" ");
                       
                    } 
                }
                System.out.println("");
               }    
            
            
            
            
            
        }
        else
            System.out.println("Matrix Multiplication is not possible");
    }
}


