package JAVADSA;

 class BubbleSort {
    // big O notation = o(n^2)
    public static void main(String[] args) 
    {
        // int arr[] = {23, 43, 21, 76, 5, 42, 89, 88 , 55, 45, 90, 12, 24, 35};
        int arr[] = {9, 7, 6, 1, 0, 2, 3, 5 , 4};
        
        bubbleSort(arr);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        
    }

    public static void bubbleSort(int[] array)
    {   int temp = 0; 
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - i - 1; j++) 
            {
            if(array[j] > array[j + 1])
            {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                // for (int nums : array) {
                //     System.out.print(nums + " ");
                // }
                // System.out.println();
                
            }
            
            


            }
        }

    }
    
}
