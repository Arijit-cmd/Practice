package section1;

import java.util.Random;

public class Randomclass {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int rnd = r.nextInt(100000);
		
		System.out.println(rnd);
		
		String str = "Arijit"+rnd;
		
		System.out.println(str);

	}

}
