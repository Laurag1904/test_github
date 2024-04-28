package rekursion;

public class Fakultät1 {
	
	public static int calculateFaculty(int n) {
		if(n == 0) {
			return 1;							// Endbedingung
		} else {
			return n* calculateFaculty(n-1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(calculateFaculty(4)); // rekursiver Aufruf 
	}
	
	

}
