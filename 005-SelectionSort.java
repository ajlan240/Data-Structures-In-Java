package JAVADSA;

 class SelectionSort {
    static int temp= 0;
    public static void main(String[] args) {
        
        int arr[] = {9, 7, 6, 1, 0, 2, 3, 5 , 4};
        
        selectionSort(arr);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    private static void selectionSort(int[] array) {
        int minIndex = 0;
        int last = array.length;        
        for(int i = 0; i < last - 1; i++)
        {   minIndex = i;
            for(int j = i + 1; j < last; j++) 
            {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
                
                
            }
                         temp = array[minIndex];
                         array[minIndex] = array[i];
                         array[i] = temp;
                    
            
            


            }
        }
        
    }
    

