import java.util.Random;

public class DogShow {

	static String[] numbers;
	
	public static void main(String[] args) {
		numbers = new String[10000];
		
		Random rand = new Random();
		int dog = rand.nextInt(numbers.length-1);
		
		for(int i = 0; i < numbers.length; i++) {
			if(i == dog) {
				numbers[i] = "Doggo";
				continue;
			}
			numbers[i] = endingCheck(i);
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
				doggoLocation = endingCheck(i);
				continue;
			}
			System.out.print(numbers[i] + " ");
			
		}
		System.out.println();
		System.out.println("Your dog finished: " + doggoLocation);
	}
	
	private static String endingCheck(int i) {
		String number = Integer.toString(i + 1);
		if(number.length() > 1 && number.charAt(number.length()-2) == '1') {
			return number + "th";
		} else {
			return number + findEnding(number.charAt(number.length()-1));
		}
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
