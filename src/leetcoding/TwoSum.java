package leetcoding;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args){
		int[] myArray = {2,7,11,15};
		int[] result = twoSumBrute(myArray, 9);
		System.out.println(Arrays.toString(result));
	}

    public static int[] twoSumBrute(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
