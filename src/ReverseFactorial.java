
public class ReverseFactorial {

	private static int loops;

	public static void main(String[] args) {

			int number = 3628800;
			if (reverseFac(number)) {
				System.out.println(number + " = " + loops + "!");
			} else {
				System.out.println(number + " NONE");
			}
			
			testFac();
	}

	
	
	private static void testFac() {
		for(int number = 0; number <= Integer.MAX_VALUE; number ++) {
			if (reverseFac(number)) {
				System.out.println(number + " = " + loops + "!");
			}
		}

	}

	private static boolean reverseFac(int number) {

		int newNum = number;
		for(loops = 1; loops <= newNum; loops++) {
			if (newNum % loops != 0) {
				return false;
			} else {
				if (newNum == loops) {
					return true;
				}
			}
			newNum = newNum / loops;
		}
		return false;
	}
}
