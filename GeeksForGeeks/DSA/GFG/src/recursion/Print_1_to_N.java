package recursion;

public class Print_1_to_N {

	public static void print(int n) {
		if(n==0)
			return;
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		print(5);
	}
}
