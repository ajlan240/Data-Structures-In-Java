package JAVADSA;

 class InsertionSor4t {
    public static void main(String[] args) {
        
        int arr[] = {9, 7, 6, 1, 0, 2, 3, 5 , 4};
        
        insertionSort(arr);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
                                                                                                                                                                                                                       
    private static void insertionSort(int[] array) {
        int key , j;
        int last = array.length;        
        for(int i = 1; i < last; i++)
        {   key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            } 
            array[j + 1] = key;
            }
                         
            }
        }
    

