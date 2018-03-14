import java.util.Random;

public class DogShow {

	static String[] numbers;
	
	public static void main(String[] args) {
		numbers = new String[1000];
		
		Random rand = new Random();
		int dog = rand.nextInt(numbers.length-1);
		
		
		for(int i = 0; i < numbers.length; i++) {
			String current;
			if(i == dog) {
				numbers[i] = "Doggo";
				continue;
			}
			
			String number = Integer.toString(i + 1);
			if( number.length() > 1 && number.charAt(number.length()-2) == '1') {
				current = number + "th";
			} else {
				current = number + findEnding(number.charAt(number.length()-1));
			}
			numbers[i] = current;
		}	
		printDogs();
	}
	
	private static void printDogs() {
		String doggoLocation = null;
		for(int i = 0; i < numbers.length; i ++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			if(numbers[i] == "Doggo") {
				String number = Integer.toString(i + 1);
				if(number.charAt(number.length()-2) == '1' && number.length() > 1) {
					doggoLocation = number + "th";
				} else {
					doggoLocation = number + findEnding(number.charAt(number.length()-1));
				}
				continue;
			}
			System.out.print(numbers[i] + " ");
			
		}
		System.out.println();
		System.out.println("Your dog finished: " + doggoLocation);
	}
	
	private static String findEnding(char number) {
		switch(number) {
		case '1':
			return "st";
		case '2':
			return "nd";
		case '3':
			return "rd";
		case '4': case '5': case '6': case '7': case '8': case '9': case '0':
			return "th";
		default:
			System.err.println("This is not a valid number");
			return null;
		}
	}

}
