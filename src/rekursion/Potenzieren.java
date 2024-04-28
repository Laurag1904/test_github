package rekursion;

public class Potenzieren {
	
	public static int pow(int base,int exponent) {    // gemacht 22.04 wiederholt nochmal 
		if(exponent == 0) {
			return 1;							
		} else {
			return base* pow(base , exponent-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(pow(3,2));

	}

}
