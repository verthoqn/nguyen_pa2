
public class Decrypter {

	public static String decrypt(String w) {

		int a = w.charAt(0);
		int b = w.charAt(1);
		int c = w.charAt(2);
		int d = w.charAt(3);
		
		if(a == 0) {
			a = 10;
			a -= 7;
		}
		else {
		a -= 7;
		}
		
		if(b == 0) {
			b = 10;
			b -= 7;
		}
		else {
		b -= 7;
		}
		
		if(c == 0) {
			c = 10;
			c -= 7;
		}
		else {
		c -= 7;
		}
		
		if(d == 0) {
			d = 10;
			d -= 7;
		}
		else {
		d -= 7;
		}
		
		String z = String.format("%d%d%d%d", d, c, a, b);
		return z;
	}
}
