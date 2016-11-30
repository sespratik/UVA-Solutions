package Solutions;

import java.util.Scanner;

public class UVA11636 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		for (int i = 0; i < 2000; i++) {
			int y = 1;
			int counter = 0;
			int n = input.nextInt();
			while (y < n) {
				y = y + y;
				counter++;
			}

			int z = n - y;
			y = y + z;
			if (n < 0) {
				break;
			}
			x++;
			System.out.println("Case " + x + ": " + counter);

		}

	}

}
