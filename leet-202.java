package LinkedList.leetcodeQns;

import java.util.Scanner;

class Solution {
    private static int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = rem * rem;
            num = num / 10;
        }
        return ans;
       

    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (fast ==  1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to be checked");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (isHappy(num)) {
            System.out.println("it is a happy number");
        }
        else {
            System.out.println("unfortunately it is not a happy number");
        }
    }
}
