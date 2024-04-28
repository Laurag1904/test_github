package rekursion;

public class Binomialkoeffizient3 {
	
	public static int binomialkoeffizient(int n ,int k) {
		if(k == 0 || k==n) {
			return 1;		
		} else {
			return binomialkoeffizient(n-1,k-1) + binomialkoeffizient(n-1,k);
		}
	}

	public static void main(String[] args) {
		System.out.println(binomialkoeffizient(4, 2));

	}

}
