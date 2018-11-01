import java.util.Scanner;

public class PrimeApp extends PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String contPrompt = "y";
		
		do {
	
		System.out.println("Please enter a # and this program will output the nth prime # in that position.");
		
		int userChoice = scan.nextInt();
		
		System.out.println(PrimeNumber.findPrime(userChoice));
		
		System.out.println("Would you like to continue? Y/N");
		
		scan.nextLine();
		
		contPrompt = scan.nextLine();
		
		} while (contPrompt.equalsIgnoreCase("Y"));
		
		System.out.println("Goodbye");
		
		scan.close();
	}

}
