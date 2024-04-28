package stringstringBuilder;

public class Quersummeberechenen {
	
	public static int digitSum(String value) {
		 int sum = 0;
	        for (int i = 0; i < value.length(); i++) {
	            char digitChar = value.charAt(i); // Hole jedes Zeichen im String
	            if (Character.isDigit(digitChar)) {
	                int digit = Character.getNumericValue(digitChar); // Konvertiere das Zeichen in eine Zahl
	                sum += digit; // Addiere die Ziffer zur Summe
	            }
	        }
	        return sum;
	    }

	
	public static int SumOfTheDigits() {
		 int sum = 0;
	        int value = 0;
			while (value > 0) {
	            sum += value % 10; // Addiere die letzte Ziffer zur Summe mit dem value 
	            value /= 10; // Entferne die letzte Ziffer von der Zahl
	        }
	        return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println("1+0+9+3+8");

	}

}
