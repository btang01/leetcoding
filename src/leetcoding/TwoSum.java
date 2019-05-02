package leetcoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args){
		int[] myArray = {2,7,11,15};
		int[] result = twoSumBrute(myArray, 9);
		System.out.println(Arrays.toString(result));
	}

	// Time Complexity O(n^2)
	// Space Complexity O(1)
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
    
    // Trade space for time
    // Hash table implementation
    public static int[] twoSumSpeedier(int[] nums, int target){
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < nums.length; i++){
    		map.put(nums[i], i);
    	}
    	
    	for (int i = 0; i < nums.length; i++){
    		int complement = target - nums[i];
    		if(map.containsKey(complement) && map.get(complement) != i){
    			return new int[] {i, map.get(complement)};
    		}
    	}
    	throw new IllegalArgumentException("No two sum solution!");
    }
}
