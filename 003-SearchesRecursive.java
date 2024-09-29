package Searches;
class Lesson3 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 9, 15, 18, 21, 23, 29, 31, 38, 39, 40};
        int num1 = 38;
        // int index = linearSearch(arr, num1);
        // int index = binarySearch(arr, num1);

        int index = binarySearch(arr, num1, 0, arr.length - 1);
        if (index != -1) 
        {
            System.out.println("Element found at the Position "+ (index + 1)  );
        }
        else 
        {
            System.out.println("Unfortunately element does not found");
        }
     
    }

    public static int linearSearch(int[] array, int n)
    {   int flag = -1;
        for (int i = 0; i < array.length; i++){
            if(array[i] == n){
                flag  = i; 
                break;
        } 
        }
        return flag;
        
    }

    // public static int binarySearch(int[] array, int n)
    // {   int flag = -1;
    //     int left = 0, right = array.length - 1, mid;
    //     while (left <= right) 
    //     {
    //         mid = (left + right) / 2;

    //         if(array[mid] == n){ 
    //             flag = mid;
    //             break;
    //         }
    //         else if(array[mid] < n)    
    //             left = mid + 1;
    //         else 
    //             right = mid - 1;    
    //     }
    //     return flag;
    // }

     // we can use RECURSIVE function instead of while loop

     public static int binarySearch(int[] array, int n, int left, int right){
    //     int flag = -1;
         int  mid = (left + right) / 2;

             if(array[mid] == n){ 
                 return mid;
             }
             else if(array[mid] < n)    
                 return binarySearch(array, n,  mid + 1, right);
             else 
                 return binarySearch(array, n, left,  mid - 1);

             
         

            }
}
