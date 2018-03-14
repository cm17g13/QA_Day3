
public class Main {

	private static int loops;

	public static void main(String[] args) {

		int number = 24;

		if (reverseFac(number)) {
			System.out.println(number + " = " + loops + "!");
		} else {
			System.out.println(number + " NONE");
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
