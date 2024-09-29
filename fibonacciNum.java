package Recursion;
// to get number infibonacci series at 'n' th position
public class fibonacciNum {
    // formulla of fibonacci number 
    //              : fibo(n) = fibo(n - 1) + fibo(n - 2) -> Reccurance relation
    // try to figure out the recurrrance tree
    // the base conditon is :
    //                     ->  fibo(0) = 0 & fibo(1) = 1
    
    
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

/* 
    1.identify if you can break the problems into small problems
    2. Write the recursion relation 
    3. draw the recursionntree 
    4. about the tree
        -> see the flow of function , how theybare getting in stack
        -> identify and focus on left and right tree calls

    5. see how the values are return at each point     
*/






}
