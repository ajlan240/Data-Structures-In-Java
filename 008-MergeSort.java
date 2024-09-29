package JAVADSA;

 class MergeSort {
    
    public static void main(String[] args) {
        
        int arr[] = {8, 5, 2, 1, 6, 7};
        
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) 
        {

            System.out.print(arr[i] + " ");
        }
    }
                                                                                                                                                                                                                       
    private static void mergeSort(int[] array, int low , int high) 
       {    
        
        if(high > low)
        {
            int mid = (high + low) / 2;
            
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);  
            merge(array, low, mid, high);
        }

       }


    private static void merge(int[] array, int low, int mid, int high) {
        
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (int x = 0; x < n1; x++) 
        {

            lArr[x] = array[low + x];
           
        }
        

            for (int y = 0; y < n2; y++) 
        {

            rArr[y] = array[mid + 1 + y];
           
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2) {
            if(lArr[i] <= rArr[j]) {
                array[k] = lArr[i];
                i++;

            }
            else
            {
                array[k] = rArr[j];
                j++;
            }
            k++;

        }
    
        while(i < n1){
            array[k] = lArr[i];
            i++;
            k++;
        }   
        while(j < n2){
            array[k] = rArr[j];
            j++;
            k++;
        }   
       
    
    

    }

    

}