import java.util.Random;

public class DogShow {

	static String[] numbers;
	
	public static void main(String[] args) {
		
		//This is the total number of dogs in the show		
		final int dogNumberg = 100;
		numbers = new String[dogNumberg];
		
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
			//return number + findEnding(number % 10) 
			//If number was an int this would be possible
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
		default:
			return "th";
		}
	}

}
