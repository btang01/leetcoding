package leetcoding;

public class RemoveElementFromArraySolution {
	
	public static void main(String[] args){
		int[] nums = {1, 2, 3, 3, 4};
		int value = 3;
		int numberOfElementsLeft = removeElement(nums, value);
		
		System.out.println(numberOfElementsLeft);
		
		int[] nums2 = {1, 2, 3, 5, 4};
		int value2 = 4;
		int numberOfElementsLeft2 = removeElement(nums2, value2);
		System.out.println(numberOfElementsLeft2);
	}
	
	// Time Complexity: O(n) --> traverse 2n
	// Space Complexity: O(1)
	public static int removeElement(int[] nums, int value){
		int i = 0;
		
		for(int j = 0; j < nums.length; j++){
			if(nums[i] != value){
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
	
	// When elements to remove are rare...
	public static int removeElementRare(int[] nums, int value){
		int i = 0;
		
		int n = nums.length;
		while(i < n){
			if(nums[i] == value){
				nums[i] = nums[n - 1];
				// reduce array size by 1
				n--;
			} else {
				i++;
			}
		}
		return n;
	}
}
