package leetcoding;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberSolution {
	
	public static void main(String[] args){
		int[] myTestArray = {2, 2, 1};
		int mySolution = singleNumber(myTestArray);
		System.out.println(mySolution);
	}
	
	public static int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int mySingleNumber = 0;
        
        for(int i = 0; i < nums.length; i++){
            int complement = nums[i];
            if(myMap.containsKey(complement)){
            	myMap.remove(complement);
            } else {
            	myMap.put(nums[i], i);
            }
        }
        
        for(int y : myMap.keySet()){
        	mySingleNumber = y;
        }
        
        return mySingleNumber;
    }
}
