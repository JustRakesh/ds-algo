package recursion;

public class Check_Palindrome {

	
	public static boolean isPalindrome(String input, int left, int right) {
		if(left >= right)
			return true;
		
		return (input.charAt(left)==input.charAt(right) && isPalindrome(input, left+1, right-1));
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("abbabba", 0, 6));
		System.out.println(isPalindrome("gecg",0,3));  
	}
}
