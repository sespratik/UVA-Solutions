package Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class UVA1339 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while(reader.hasNextLine()){
			char [] messageOnPlate = reader.nextLine().toCharArray();
			int [] checkFrequencyForMessageOnPlate = new int[100];
			
			for (char x : messageOnPlate){
				checkFrequencyForMessageOnPlate[x]++;
			}
			
			char [] originalMessage = reader.nextLine().toCharArray();
			int [] checkFrequencyForOriginalMessage = new int[100];
			
			for (char x : originalMessage){
				checkFrequencyForOriginalMessage[x]++;
			}
			
			Arrays.sort(checkFrequencyForMessageOnPlate);
			Arrays.sort(checkFrequencyForOriginalMessage);
			
			if (Arrays.equals(checkFrequencyForMessageOnPlate, checkFrequencyForOriginalMessage)){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}
