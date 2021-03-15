package practical1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int RandomNumber = ran.nextInt(999);
		int[]generateRandom = new int[500];
		for(int i =0;i<500;i++) {
			generateRandom[i] = ran.nextInt(999);
		}
	int A = scan.nextInt();
	Arrays.sort(generateRandom);
	System.out.println(generateRandom[A-1]);
		
	}
	

}
