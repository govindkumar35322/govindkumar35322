package Pay.fund.validation;

import java.sql.Timestamp;
import java.util.Random;

public class Utility {
	
	public static String  generateAccNum() {
	//UUID randomuuid=UUID.randomUUID();// to generate random number
	Random rnd=new Random();
	int part1=rnd.nextInt(654321);
	int part2=rnd.nextInt(99999);
	
	return String.valueOf(part1+""+part2);
}
	
	public static String gettimestamp() {
		Timestamp timestamp=new Timestamp (System.currentTimeMillis());
	return String.valueOf(timestamp);
	}

	
}
