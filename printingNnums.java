package Recursion;

public class printingNnums {

    // here we are just printing the n natural numbers 

    public static void main(String[] args) {
        print(1);
    }

    // space complexity is the issue in the case of recursion
    public static void print(int n) {
        // if there is no base condition the loop work as infinity and memory losed is lot
       // memory of the of computer become increased and we get stack overflow error
        if (n == 5) {  // this is called base condition
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n + 1);  // here the process is called 'tail Recursion'

        // each function calls happened in the stack memory

        // why Recursion ??
        //          : it help us solving the bigger problem simpler way
        //          you can convert recursion solution into iteration and vice  versa
       
        

    }
    
}