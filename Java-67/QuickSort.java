import java.util.Arrays;

class QuickSort 
{
	public static void main(String[] args) 
	{
       int arr[] = {10, 7, 8, 9, 1, 5}; 
	   System.out.println("Original Array");
	   System.out.println(Arrays.toString(arr));

       int n = arr.length; 
  	   quickSort(arr, 0, n-1); 
  
       System.out.println("Sorted Array"); 
	   System.out.println(Arrays.toString(arr));       
	}

	static void quickSort(int[] arr, int low, int high)
	{
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before partition and after partition 
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high);       
		}
	}

    /* This function takes last element as pivot,
	   places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for(int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
}
