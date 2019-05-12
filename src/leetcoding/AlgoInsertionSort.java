package leetcoding;

public class AlgoInsertionSort {
	
	/* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
        insertionSort(arr); 
        printArray(arr); 
    } 
    
    // Time Complexity O(n^2)
    // Aux Space O(1)
	public static void insertionSort(int[] nums){
		int n = nums.length;
		
		for(int i = 1; i < n; i++){
			int key = nums[i];
			int j = i - 1;
			
			/* Move elements of nums[0... i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			while(j >= 0 && nums[j] > key){
				nums[j+1] =  nums[j];
				j = j - 1;
			}
			
			nums[j+1] = key;
		}
	}
}
