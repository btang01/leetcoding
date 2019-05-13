package leetcoding;

public class AlgoBubbleSort {
	
	public static void main(String[] args){
		int[] numbers = {9, 3, 45, 6};
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j<10; j++){
				System.out.println("Outer index: " + i + "Inner Index: " + j);
			}
		}
		
		bubbleSort(numbers);
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
	
	// Worst + Avg Case Time Complexity O(n^2)
	// Best Case Time Complexity O(n)
	// Aux Space O(1)
	// Sorting in Place = Yes
	// Stable = Yes
	public static void bubbleSort(int[] nums){
		
		int n = nums.length;
		
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				
				if(nums[j] > nums[j+1]){
					int holdOldNum = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = holdOldNum;
				}
			}
		}
	}
}
