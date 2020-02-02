
public class Encrypter {

	public static String encrypt(String x) {
		
		int a = x.charAt(0);
		int b = x.charAt(1);
		int c = x.charAt(2);
		int d = x.charAt(3);
		
		a += 7;
		a %= 10;
		
		b += 7;
		b %= 10;
		
		c += 7;
		c %= 10;
		
		d += 7;
		d %= 10;
				
		String y = String.format("%d%d%d%d", d, c, a, b);
		return y;
	}

}
