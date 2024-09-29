package Searches;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Lesson1{
    public static void main(String[] args) {
        int flag = 0;
        List<Integer> nums =  Arrays.asList(1 , 3 , 6 , 9 , 13 , 15 , 19 , 25 , 27);
        System.out.println("Enter a Number");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int step = 0;
        for (Integer n : nums){
            step++;
            if (num1 == n ){
                flag = 1;
                break;
            }
              

        }
        System.out.println("No of Steps Taken is : " + step);
        if (flag == 1)
            System.out.println("Element is found");
        else
            System.out.println("element not found");    
        
    }
}
