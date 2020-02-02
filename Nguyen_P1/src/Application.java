import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Enter a 4-digit integer: ");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		String digits = Integer.toString(number);
		
		int selection = 0;
		String output = "";

		System.out.println("Enter 1 to encrypt, 2 to decrypt, or any other key to exit: ");
		Scanner option = new Scanner(System.in);
		selection = option.nextInt();
			
		if(selection == 1) {
			output = Encrypter.encrypt(digits);
			System.out.print("The encrypted value is: " + output);
		}
		
		if(selection == 2) {
			output = Decrypter.decrypt(digits);
			System.out.print("The encrypted value is: " + output);
		}
			
		else {
			System.exit(0);
		}
		
	}

}
