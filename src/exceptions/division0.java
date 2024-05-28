package exceptions;

public class division0 {

	public static void main(String[] args) {
		
		System.out.println(divide(10, 2));  
        System.out.println(divide(10, 0));

	}
	
	public static String divide(int x, int y) {
        try {
            return String.valueOf(x / y);
        } catch (ArithmeticException e) {
            return "Fehler Division durch 0 ist nicht erlaubt!";
        }
	}	
}
