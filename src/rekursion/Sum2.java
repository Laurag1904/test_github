package rekursion;

public class Sum2 {

	public static int sum (int n) {
		if(n == 0) {
			return 0;		
		} else {
			return Integer.sum(sum(n-1), n);
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(sum(5));

	}

}
