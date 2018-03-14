
public class Calculator {

	
	
	public static void main(String[] args) {
		int[] numbers = {2, 4, 8};
		
		int result1 = canMultiply(numbers);
		
		if(result1 < 3) {	
			if(result1 == 0) {
				printMultiply(numbers[0], numbers[1], numbers[2]);
			} else if(result1 == 1) {
				printMultiply(numbers[1], numbers[2], numbers[0]);
			} else {
				printMultiply(numbers[2], numbers[0], numbers[1]);
			}
			//if 0 then 0, 1, 2 
			//if 1 then 1, 2, 0
			//if 2 then 2, 0, 1
			
			System.out.println();
		}
		
		int result2 = canAdd(numbers);
		if(result2 < 3) {
			if(result2 == 0) {
				printAdd(numbers[0], numbers[1], numbers[2]);
			} else if(result2 == 1) {
				printAdd(numbers[1], numbers[2], numbers[0]);
			} else {
				printAdd(numbers[2], numbers[0], numbers[1]);
			}
		}
		
	}
		
	private static void printMultiply(int x, int y, int z) {
		System.out.println(x + " * " + y + " = " + z);
		System.out.println(z + " / " + y + " = " + x);
		System.out.println(z + " / " + x + " = " + y);
		
		//a * b = c
		//c / b = a
		//c / a = b		
	}
	
	private static void printAdd(int x, int y, int z) {
		System.out.println(x + " + " + y + " = " + z);
		System.out.println(z + " - " + y + " = " + x);
		System.out.println(z + " - " + x + " = " + y);
		//a + b = c
		//c - b = a
		//c - a = b
	}
	
	private static int canMultiply(int[] numbers) {
		for(int i = 0; i < 3; i++) {
			if(numbers[i%3] * numbers[(i+1) % 3] == numbers[(i+2) % 3]) {
				return i;	
			}
		}
		return 3;
	}
	
	private static int canAdd(int[] numbers) {
		for(int i = 0; i < 3; i++) {
			if(numbers[i%3] + numbers[(i+1) % 3] == numbers[(i+2) % 3]) {
				return i;	
			}
		}
		return 3;
	}

}
