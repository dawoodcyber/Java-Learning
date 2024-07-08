/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltquiz;
class MathWork{
        
    public void Factor(int n){
        System.out.println("Factors ");
      
        
        
        for(int i=1; i<11; i++)
        {
            System.out.print(n+" *"+i+" ="+(n*i));
            System.out.println("");
       }
    }
}
public class LTQuiz {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("LT # QUIZ");
        MathWork d = new MathWork();
        d.Factor(10);
        System.out.println("");
      
    }

}
