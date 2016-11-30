package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVA11039 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of cases: ");
		int p = reader.nextInt();
		
		for (int a =0; a < p; a++ ){
			List<Integer> floorOrder = new ArrayList<>();
			System.out.println("Enter number of floors: ");
			int n = reader.nextInt();
			
			if (n > 500000)
				break;
			
			for (int b =0; b < n; b++){
				System.out.println("Enter floor size: ");
				int floorSpecs = reader.nextInt();
				floorOrder.add(floorSpecs);
				if (floorSpecs > 999999 || floorSpecs < -999999)
					break;
			}
			floorOrder.sort(null);
			System.out.println(floorOrder);
		}

	}

}
