package stringstringBuilder;

public class PasswortTester {

	public static boolean isGoodPassword(String password) {

	    //Mindestl�nge definieren und �berpr�fen
	    final int MIN_length = 10;
	    if (password_length < MIN_length) {
	        System.err.println ("Ihr Passwort ist zu kurz, es muss mindestens" + MIN_length + "Zeichen lang sein!");
	        return false;
	    }

	    //Sonderzeichen �berpr�fen
	     boolean hasSpecialChar = false;
	     for (char c: password.toCharArray()) {
	         if (!Character.isLetterOrDigit(c)) {
	             hasSpecialChar = true;
	             break;
	         }
	     }

	     //Fehlermeldung wenn kein Sonderzeichen vorhanden ist
	        if (!hasSpecialChar) {
	            System.err.println("Das Passwort muss mindestens ein Sonderzeichen enthalten.");
	            return false;
	        }

	        String password1 = "Passwort123!";
	        boolean isGood = isGoodPassword(password1);

	        if (isGood) {
	            System.out.println("Passwortst�rke: Gut!");
	        } else {
	            System.out.println("Passwortst�rke: Schlecht!");
	        }
	}

}
