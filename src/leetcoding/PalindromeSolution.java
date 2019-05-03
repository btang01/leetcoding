package leetcoding;

public class PalindromeSolution {
	
	public static void main(String[] args){
		Boolean isItAPalindrome = determinePalindrome(101);
		
		System.out.println(isItAPalindrome);
	}
	
	public static Boolean determinePalindrome(Integer targetNum){
		Boolean isPalindrome = false;
		int originalTargetNum = targetNum;
		int reverse = 0;
		
		while(targetNum > 0){
			reverse = reverse * 10 + targetNum % 10;
			targetNum = targetNum/10;
		}
		
		if(originalTargetNum == reverse){
			isPalindrome = true;
		}
		
		return isPalindrome;
	}
}
