package musicalChairs;

public class MusicalChaireGames {

	public static void main(String[] args) {
		
		MusicalChair mc1 = new MusicalChair ("Lisa", "Susi", "Tom", "Lukas");
		System.out.println(mc1);
		
		MusicalChair mc2 = new MusicalChair ("Madlen", "Benedikt");
		System.out.println(mc2);
		
		//MusicalChair mc3 = new MusicalChair();
		//System.out.println(mc3);
		
		mc1.rotate(2);
		System.out.println(mc1);
		
		mc1.rotateAndRemove(2);
		System.out.println(mc1);
		

	}

}
