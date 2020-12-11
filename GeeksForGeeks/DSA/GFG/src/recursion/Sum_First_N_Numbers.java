package recursion;

public class Sum_First_N_Numbers {

	public static int sumFirstNNaturalNNumbers(int n) {
		if(n==0)
			return 0;
		return n+ sumFirstNNaturalNNumbers(n-1);
	}
	public static void main(String[] args) {
		System.out.println(sumFirstNNaturalNNumbers(4));
	}
}
