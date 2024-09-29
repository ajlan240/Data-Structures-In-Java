package Searches;
/// Binary Search

import java.util.Scanner;
// Big O Notation O(logn) base 2
class BinarySearch {
    public void search(int[] nums, int num1){
        int left = 0, right = nums.length - 1, flag = -1 , mid , step = 0;
        while (right >= left) {
            step++;

            mid = (right + left) / 2;

            if (nums[mid] == num1 ){
               flag = 1;
                break;
            }
            else if (nums[mid] > num1)
                right = mid - 1;
            else 
                left = mid + 1;
                  
        }
        System.out.println("No of Steps Taken is : " + step); 
        
        if (flag == 1){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

    }

}
class Lesson2 {
    public static void main(String[] args) {
        int arr[] = {1 , 3 , 6 , 9 , 13 , 15 , 19 , 25 , 27};
        System.out.println("Enter a number");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinarySearch obj = new BinarySearch();                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        obj.search(arr, n);
        
    }
    
}
