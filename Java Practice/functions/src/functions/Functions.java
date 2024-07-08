package functions;

public class Functions {

    public static void main(String[] args) {
        int a = 5, b = 4, res;
        res = fun(a, b);
        System.out.println(res);
        res = fun(1, 5, a, b, 7, 99, 100);
        System.out.println(res);
    }
    static int fun(int...numbers)
    {
        int minimumNumber= Integer.MAX_VALUE;
        for(int min: numbers)
        {
            if(minimumNumber>min)
            {
                minimumNumber = min;
            }
        }
        return(minimumNumber);
        
        
        
            
    }
}
