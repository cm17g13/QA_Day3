import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Goldilocks {

	static ArrayList<ChairPorridge> chairPorridges;
	static ArrayList<ChairPorridge> suitable;
	static int goldiWeight;
	static int goldiTemp;

	public static void main(String[] args) {

		chairPorridges = new ArrayList<ChairPorridge>();
		try {
			readInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		suitable = new ArrayList<ChairPorridge>();

		int x = 0;
		for(ChairPorridge chairPorridge : chairPorridges) {
			x++;
			if(chairPorridge.getChair() >= goldiWeight && chairPorridge.getPorridge() <= goldiTemp) {
				chairPorridge.setIndex(x);
				suitable.add(chairPorridge);
				System.out.print(x + " ");
			}
		}

		if (suitable.isEmpty()) {
			return;
		}

		System.out.println();
		System.out.print("Seats ");

		for (int i = 0; i < suitable.size(); i++) {
			if (i != 0) {
				if (i == suitable.size() - 1) {
					System.out.print(" and ");
				} else {
					System.out.print(", ");
				}
			}
			System.out.print("#" + suitable.get(i).getIndex());
		}
		System.out.println(" have good enough chairs to not collapse under Goldilocks, and porridge that is cool enough for her to eat.");

	}

	private static void readInput() throws IOException {
		
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/Admin/eclipse-workspace/QA_Day3/src/advancedInput.txt"));
			String line = br.readLine();
			String[] numbers = line.split(" ");
			goldiWeight = Integer.parseInt(numbers[0]);
			goldiTemp = Integer.parseInt(numbers[1]);
			
			String currentLine = br.readLine();
			while (currentLine != null) {
				String[] values = currentLine.split(" ");
				System.out.println(Integer.parseInt(values[0]) + " " + Integer.parseInt(values[1]));
				int weight = Integer.parseInt(values[0]);
				int temp = Integer.parseInt(values[1]);
				chairPorridges.add(new ChairPorridge(weight, temp));
				currentLine = br.readLine();
			}
			br.close();
		}
			
		
	

}
