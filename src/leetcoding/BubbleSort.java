package leetcoding;

public class BubbleSort {
	
	public void bubbleSort(int[] nums){
		
		int numsLength = nums.length;
		
		for(int i = 0; i < numsLength; i++){
			for(int j = 1; j < (numsLength - 1); j++){
				
				if(nums[j] > nums[j+1]){
					int holdOldNum = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = holdOldNum;
				}
			}
		}
	}
}
