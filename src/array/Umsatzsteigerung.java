package array;

public class Umsatzsteigerung {
	
	public int count5PercentJumps(int[]gains) {
		int [] dailyGains = {1000, 2000, 500, 9000, 9010};
		for(int i = 0; i < dailyGains.length; i++) {
			dailyGains[i]= i +1;
			System.out.println(dailyGains);
		}
		for(double i = 0; i< dailyGains.length; i = i + 0.5) {
			if (dailyGains.length < 9000) {
				
			}else {
				
			}
		}
		return 0;
	}

}
