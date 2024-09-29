package JAVADSA;
// Big                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
 class QuickSort {
    public static void main(String[] args) {
        
        int arr[] = {9, 7, 6, 1, 0, 2, 3, 5, 4};
        
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
                                                                                                                                                                                                                       
    private static void quickSort(int[] array, int low , int high) 
       {
        if(high > low){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);  
        }

       }

    //    //Hoare partition approach
    // private static int partition(int[] array, int low, int high) 
    //    {
    //     int pivot = array[low];
    //     int end = high + 1;
    //     int start = low - 1;
        
    //     while (true) {
    //         do {
    //             start++;
    //         } while (array[start] < pivot);

    //         do {
    //             end--;

    //         } while (array[end] > pivot);

    //         if (start >= end)
    //             return end; // this is to set next pivot 

    //         int  temp = array[start];
    //             array[start] = array[end];
    //             array[end] = temp;
    //     }
    //  }



     //lomutoPartition approach

    private static int partition(int[] array, int low, int high) 
     {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(array[j] <= pivot){
                i++;
                swap(array, i, j);            
            }
        }
        swap(array, i + 1, high);
        
        return i + 1;
    
   }

    
     static void swap(int[] array, int i, int j) {

        int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        
        
    }

}
