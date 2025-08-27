import java.io.*;
import java.util.Scanner;

class ArteAscii {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for (int i = number; i >= 1; i--){
			for (int j = i; j > 0; j--)
				System.out.print('*');
			System.out.println();
		}
		for (int i = 1; i <= number; i++){
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
		scanner.close();
	}
}
